package com.unipago.unisigma.usecase.tasks.reglas;


import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.local.IReglasIntercambioInformacion;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.*;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarEjecucionesIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarUltimoIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.utils.FechaUtil;
import gs.hexagonaldemo.springhexagonaldemo.utils.ParametrosUSConstantes;
import gs.hexagonaldemo.springhexagonaldemo.utils.ParseXML;
import gs.hexagonaldemo.springhexagonaldemo.utils.ValidationUtil;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;


public abstract class AbstractReglasIntercambioInformacion implements IReglasIntercambioInformacion {

    protected ContextData contextData;
    protected ServiciosContext serviciosContext;

    @Override
    public boolean estaServicioCatalogado() {
        System.out.println("Entering estaServicioCatalogado");
        boolean estaCatalogado = false;

        System.out.println("Buscando el servicio proporcionado....");
        ServicioSistema servicioSistema = serviciosContext.getServicioES().buscarServicioPorId(contextData.getSolicitud().getServicioId()).get();

        if(servicioSistema.getEstado().equals(ParametrosUSConstantes.Estados.ESTADO_AC)){
            System.out.println("El servicio proporcionado esta catalogado y activo!");
            contextData.setServicioId(servicioSistema.getServicioId());
            estaCatalogado = true;
        }
        if(!estaCatalogado){
            System.out.println("El servicio no esta catalogado!");
            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.EL_SERVICIO_PROPORCIONADO_NO_ESTA_CATALOGADO);
        }
        return estaCatalogado;
    }

    @Override
    public boolean existeIntercambioInformacion() {
        System.out.println("Entering ");
        boolean valido = false;

        System.out.println("Buscando el intercambio informacion solicitado....");

        System.out.println("Asignando al contexto el tipo de intercambio de informacion");
        contextData.setTipoIntercambio(obtenerTipoIntercambio());

        List<IntercambioInformacion> intercambiosInformacion = serviciosContext.getIntercambioInformacionES()
                .buscarIntercambiosInformacionPorServicio(contextData.getSolicitud().getServicioId(),contextData.getTipoIntercambio(),
                        ParametrosUSConstantes.Estados.ESTADO_AC);
        System.out.println("Verificando si se encontro intercambios para el servicios suministrado...");

        if(intercambiosInformacion.isEmpty()){
            System.out.println("No existe intercambios activos para el servicio !");
            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.INTERCAMBIO_INFORMACION_NO_CATALOGADO);
        }else{
            System.out.println("Existen intercambios para el servicio, tomando el primero...");
            contextData.setIntercambio(intercambiosInformacion.get(0));
            valido = true;
        }
        return valido;
    }

    public boolean validaTiempoRetencionInformacion(){
        System.out.println("Entering validaTiempoRetencionInformacion");
        boolean valido = true;
        System.out.println("validando si aplica para tiempo retencion informacion");

        if(!contextData.getIntercambio().getValidaTiempoRetencionInformacion()){
            System.out.println("no aplica para validar TiempoRetencionInformacion");
            return true;
        }

        System.out.println("aplica para validacion tiempo retencion informacion ");

        System.out.println("buscar Parametro retencion informacion ");

        System.out.println("Buscar ejecucion intercambio por servicio parametros y estados.. ");
        List<String> estados = new ArrayList<>();
        estados.add(ParametrosUSConstantes.Estados.ESTADO_PE);
        estados.add(ParametrosUSConstantes.Estados.ESTADO_OK);
        List<ParametroEjecucion> parametrosEjecucion =contextData.getSolicitud().getParametrosEjecucion();

        BuscarEjecucionesIntercambioInformacionPorServicioType input =
                new BuscarEjecucionesIntercambioInformacionPorServicioType(contextData.getSolicitud().getServicioId(), estados, parametrosEjecucion);
        System.out.println("iniciando busqueda");

        // llamada a la capacidad
        Optional<List<EjecucionIntercambioInformacion>> response  = serviciosContext.getEjecucionIntercambioInformacionES().buscarEjecucionesIntercambioInformacionPorServicio(input);

        System.out.println("ejecuciones intercambio count :  "+ response.get().size());

        if(response.get().size() > 0){
            System.out.println("validando ejecucion intercambios encontradas");

            String tiempoRetencion = serviciosContext.getParametroES().buscarValorParametro(ParametrosUSConstantes.Parametros.TIEMPO_RETENCION_INTERCAMBIO_INFORMACION,null,
                    contextData.getSolicitud().getServicioId()).getValor();

            Long diasRetencion = Long.parseLong(tiempoRetencion);
            System.out.println("tiempo retencion intercambio informacion Dias:  "+diasRetencion);

            for(EjecucionIntercambioInformacion ejecucion : response.get() ){
                Long diasEntreFecha = FechaUtil.diferenciaEnDiasEntreFechas(ejecucion.getFechaInicio(), LocalDate.now());
                if(diasEntreFecha < diasRetencion){
                    System.out.println("ya existe una ejecucion para el proceso con los mismo paramatero dentro de la fecha de retencion");
                    contextData.getMotivos().add(ParametrosUSConstantes.Motivos.YA_EXISTE_UNA_EJECUCION_PARA_EL_PROCESO_DE_GENERACION_DE_FACTURACION_EN_ESTADO_DISTINTA_DE_RECHAZADA);
                    valido = false;
                }
            }
        }
        System.out.println("returning valido: "+valido);
        return valido;
    }


    @Override
    public boolean esIntercambioInformacionDeTipoValido() {
        System.out.println("Entering ");
        boolean valido = true;
        contextData.setTipoIntercambio(obtenerTipoIntercambio());

        System.out.println("Verificando si el tipo de intercambio se corresponde con el solicitado...");
        if(contextData.getIntercambio().getTipoIntercambioInformacion() != obtenerTipoIntercambio()){
            System.out.println("EL intercambio no se corresponde con el tipo de intercambio de la via solicitada");
            valido = false;
            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.INTERCAMBIO_NO_CORRESPONDE_AL_TIPO_DE_INTERCAMBIO_SOLICITADO);
        }
        return valido;
    }

    @Override
    public boolean validarEjecucionPreviaIntercambio() {
        System.out.println("Entering ");
        boolean valida = true;
        System.out.println("Buscando ejecucion previa del servicio solicitado: " + contextData.getIntercambio().getServicioId());
        if(contextData.getIntercambio().getValidaEjecucionPrevia()){
            List<String> estadosEjecucion = new ArrayList<String>();
            estadosEjecucion.add(ParametrosUSConstantes.Estados.ESTADO_OK);
            int servicioId;
            boolean pendienteRespuesta = true;

            if(contextData.getIntercambio().getTipoIntercambioInformacion() ==  ParametrosUSConstantes.TipoIntercambioInformacion.ENVIAR_INFORMACION){
                System.out.println("Validando que no exista una ejecucion previa del servicio: " + contextData.getIntercambio().getServicioId());
                estadosEjecucion.add(ParametrosUSConstantes.Estados.ESTADO_PE);
                servicioId = contextData.getIntercambio().getServicioId();
            }else{
                System.out.println("Validando que exista una ejecucion previa del servicio: " + contextData.getIntercambio().getServicioEnvioId());
                servicioId = contextData.getIntercambio().getServicioEnvioId();
            }

            System.out.println("Buscando la ejecucion...");
            Optional<EjecucionIntercambioInformacion> ejecucionIntercambioInformacion = serviciosContext.getEjecucionIntercambioInformacionES().buscarUltimoIntercambioInformacionPorServicio(new BuscarUltimoIntercambioInformacionPorServicioType(servicioId, estadosEjecucion, pendienteRespuesta));
            System.out.println("Existe una ejecucion, verificando si se esta validando un intercambio de envio...");

            if(!ejecucionIntercambioInformacion.isPresent()){

                System.out.println("No existe Ejecucion de Intercambio, verificando si se esta validando un intercambio tipo respuesta...");

                if(contextData.getIntercambio().getTipoIntercambioInformacion() ==  ParametrosUSConstantes.TipoIntercambioInformacion.RECIBIR_INFORMACION){
                    System.out.println("Se esta validando un intercambio tipo respuesta, asignando motivo de error...");
                    contextData.getMotivos().add(ParametrosUSConstantes.Motivos.NO_EXISTE_EJECUCION_INTERCAMBIO_INFORMACION_PREVIA_SERVICIO_SOLICITADO_PENDIENTE_RESPUESTA);
                    valida = false;
                }

            }
            if(contextData.getIntercambio().getTipoIntercambioInformacion() ==  ParametrosUSConstantes.TipoIntercambioInformacion.ENVIAR_INFORMACION){
                System.out.println("Se esta validando un intercambio de envio y la ejecucion: " + ejecucionIntercambioInformacion + " no posee fecha de respuesta");
                contextData.getMotivos().add(ParametrosUSConstantes.Motivos.EXISTE_EJECUCION_PREVIA_SERVICIO_SOLICITADO_PENDIENTE_RESPUESTA);
                valida = false;
            }
        }
        return valida;
    }

    @Override
    public boolean esCorrespondenciaTipoDatoParametrosValida() {
        System.out.println("Entering ");
        boolean parametrosValidos = true;


        System.out.println("Verificando si se proporciono parametro...");
        if(!ValidationUtil.isNullOrEmptyList(contextData.getSolicitud().getParametrosEjecucion())){
            System.out.println("Fueron proporcionados parametros, validando sus tipos de datos y que se correspondan con algun parametro del intercambio...");

            Parametros_Ejecucion:
            for (ParametroEjecucion parametroEjecucionSolicitud : contextData.getSolicitud().getParametrosEjecucion()) {
                System.out.println("Validando correspondencia y tipo de dato del parametro: " + parametroEjecucionSolicitud.getNombre());
                boolean parametroCorresponde = false;

                for (ParametroIntercambioInformacion parametroIntercambioInformacion : contextData.getIntercambio().getParametros()) {
                    System.out.println("Verificando si el parametro intercambio: " + parametroIntercambioInformacion.getNombre() + " se corresponde con el parametros proporcionado...");

                    contextData.getIdParametrosIntercambio().put(parametroIntercambioInformacion.getNombre(), parametroIntercambioInformacion.getParametroIntercambioInformacionId());

                    if(parametroIntercambioInformacion.getNombre().equalsIgnoreCase(parametroEjecucionSolicitud.getNombre())){
                        System.out.println("Parametro se corresponde, validando el tipo de dato del parametro...");
                        parametroCorresponde = true;

                        if(!ValidationUtil.esTipoDatoValido(parametroIntercambioInformacion.getTipoDato(), parametroEjecucionSolicitud.getValor())){
                            System.out.println("El parametro no cumple con el tipo de dato, agregando motivo de error...");
                            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.PARAMETRO_NO_SE_CORRESPONDE_CON_EL_TIPO_DE_DATO);
                            parametrosValidos = false;
                            break  Parametros_Ejecucion;
                        }
                        System.out.println("El tipo de dato del parametro es correcto!");

                        System.out.println("Agregando parametro a la lista de valores");
                        contextData.getValoresParametros().put(parametroIntercambioInformacion.getNombre(), parametroEjecucionSolicitud.getValor());
                    }
                }

                if(!parametroCorresponde){
                    System.out.println("No existe concidencia para el parametro: " + parametroEjecucionSolicitud.getNombre() + " agregando motivo de error...");
                    contextData.getMotivos().add(ParametrosUSConstantes.Motivos.PARAMETRO_PROPORCIONADO_NO_CORRESPONDE_AL_INTERCAMBIO_INFORMACION);
                    parametrosValidos = false;
                    break Parametros_Ejecucion;
                }


            }

        }
        return parametrosValidos;
    }

    @Override
    public boolean parametrosRequeridosProporcionados() {
        System.out.println("Entering ");
        boolean parametrosProporcionados = true;

        System.out.println("Verificando si el intercambio posee parametros...");
        if(!ValidationUtil.isNullOrEmptyList(contextData.getIntercambio().getParametros())){
            System.out.println("EL intercambio posee parametros, verificando cuales son requeridos...");
            for (ParametroIntercambioInformacion parametroIntercambioInformacion : contextData.getIntercambio().getParametros()) {

                System.out.println("Verificando si el parametro: " + parametroIntercambioInformacion.getNombre() + " es requerido y se proporciono el parametro.");
                if(parametroIntercambioInformacion.isRequerido() && !contextData.getValoresParametros().containsKey(parametroIntercambioInformacion.getNombre())){
                    System.out.println("No se proporciono parametro para el parametro requerido: " + parametroIntercambioInformacion.getNombre());
                    contextData.getMotivos().add(ParametrosUSConstantes.Motivos.PARAMETRO_REQUERIDO_NO_PROPORCIONADO);
                    parametrosProporcionados = false;
                    break;
                }

            }

        }
        return parametrosProporcionados;
    }

    @Override
    public boolean esvalidoRangoIntercambio() {
        System.out.println("Entering ");
        boolean rangoValido = true;

        System.out.println("Verificando si el intercambio posee parametros para validar rango...");
        if(!ValidationUtil.isNullOrEmptyList(contextData.getIntercambio().getParametros())){
            System.out.println("EL intercambio posee parametros, verificando cuales requieren validar rango o dias...");
            Map<String, Boolean> parametrosValidados = new HashMap<>();
            for (ParametroIntercambioInformacion parametroIntercambioInformacion : contextData.getIntercambio().getParametros()) {

                System.out.println("Verificando si el parametro: " + parametroIntercambioInformacion.getNombre() + " es requiere validar rangos..");
                if(!parametrosValidados.containsKey(parametroIntercambioInformacion.getParametroRango()) && (parametroIntercambioInformacion.getValidaRango() || parametroIntercambioInformacion.getValidaDiasRango())){

                    String valorInicial;
                    String valorFinal;


                    if(parametroIntercambioInformacion.getOrden() == 1){
                        valorInicial = contextData.getValoresParametros().get(parametroIntercambioInformacion.getNombre());
                        valorFinal = contextData.getValoresParametros().get(parametroIntercambioInformacion.getParametroRango());
                    }else{
                        valorInicial = contextData.getValoresParametros().get(parametroIntercambioInformacion.getParametroRango());
                        valorFinal = contextData.getValoresParametros().get(parametroIntercambioInformacion.getNombre());

                    }

                    if(contextData.getValoresParametros().isEmpty() || ValidationUtil.validateNullOrEmtpyStrings(valorFinal, valorInicial)){
                        continue;
                    }

                    if( parametroIntercambioInformacion.getTipoDato().equals(ParametrosUSConstantes.TipoDato.FECHA)){

                        System.out.println("Parametro valida Rango de para el tipo de dato Fecha..");

                        LocalDate fechaInicial = null;
                        LocalDate fechaFinal = null;
                        System.out.println("valorInicial: "+valorInicial);
                        System.out.println("valorFinal: "+valorFinal);
                        System.out.println("Validando el Rango...");

                        fechaInicial = FechaUtil.convertirStringALocalDate(valorInicial, ParametrosUSConstantes.Formatos.FORMATO_FECHA_PARAMETROS_VALOR);
                        fechaFinal = FechaUtil.convertirStringALocalDate(valorFinal, ParametrosUSConstantes.Formatos.FORMATO_FECHA_PARAMETROS_VALOR);

                        if(!esRangoFechaValida(fechaInicial, fechaFinal)){
                            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.FECHA_INICIAL_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_FINAL);
                            rangoValido = false;
                            break;
                        }

                        System.out.println("Rango validado exitasamente, verificando si valida cantidad de dias...");
                        if(parametroIntercambioInformacion.getValidaDiasRango() && !esCantidadDiasFechaValido(fechaInicial, fechaFinal, contextData.getIntercambio().getServicioId())){
                            System.out.println("Validacion de dias de rango fallida, asignando motivo de error");
                            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.RANGO_FECHA_EXCEDE_TIEMPO_MAX);
                            rangoValido = false;
                            break;
                        }
                        System.out.println("Todas las validaciones fueron exitasas!");
                        parametrosValidados.put(parametroIntercambioInformacion.getNombre(), Boolean.TRUE);

                    }else if(parametroIntercambioInformacion.getTipoDato().equals(ParametrosUSConstantes.TipoDato.PERIODO)){
                        System.out.println("Validando Rango de Tipo periodo...");

                        int periodoInicial = Integer.parseInt(valorInicial);
                        int periodoFinal = Integer.parseInt(valorFinal);

                        System.out.println("Realizando validaciones...");
                        if(periodoInicial > periodoFinal){
                            System.out.println("Validacion fallida, asignando motivo de error...");
                            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.EL_VALOR_INICIAL_RANGO_DEBE_SER_ANTERIOR_IGUAL_AL_VALOR_FINAL);
                            rangoValido = false;
                            break;
                        }

                        System.out.println("Validacion exitosa!");
                    }


                }

            }

        }
        return rangoValido;
    }

    @Override
    public boolean esExcepcionParametroRequerido() {
        System.out.println("Entering ");

        boolean validaParametroCondicionado = true;

        parametros:
        for (ParametroIntercambioInformacion param : contextData.getIntercambio().getParametros()) {
            System.out.println("Verificando si el parametro del intercambio es requerido condicionado...");
            boolean excepcionValida = true;

            if (!param.isRequeridoCondicionado()) {
                System.out.println("El parametro no es requerido condicionado!");
                continue;
            }

            System.out.println("Parametro requerido condicionado, aplicando validaciones...");

            for (ExcepcionParametroRequeridoIntercambioInformacion excepcion : param.getExcepcionesParametroRequerido()) {

                if (excepcion.isValorEspecifico()) {
                    System.out.println("La excepcion: " + excepcion.getExcepcionParametroRequeridoIntercambioInformacionId() + " es para un valor en especifico ..");
                    String nombreKey = getKeybyValue(contextData.getIdParametrosIntercambio(), excepcion.getParametroCondicionaRequeridoId());
                    System.out.println("Validando excepcionValida: getValorParametroCondicionaRequerido " + excepcion.getValorParametroCondicionaRequerido() +
                            " getValoresParametros " + contextData.getValoresParametros().get(nombreKey));
                    excepcionValida = Objects.equals(excepcion.getValorParametroCondicionaRequerido(), contextData.getValoresParametros().get(nombreKey));

                    System.out.println("Excepcion valida: " + excepcionValida);
                } else {
                    System.out.println("La excepcion " + excepcion.getExcepcionParametroRequeridoIntercambioInformacionId() + " requiere que exista un parametro");
                    excepcionValida = contextData.getIdParametrosIntercambio().containsValue(excepcion.getParametroCondicionaRequeridoId());
                    System.out.println("Excepcion valida: " + excepcionValida);
                }

                if (excepcionValida) {

                    excepcionValida = contextData.getValoresParametros().containsKey(param.getNombre());
                    System.out.println("Parametro fue proporcionado: " + excepcionValida);
                } else {
                    System.out.println("excepcionValida: " + excepcionValida);
                    excepcionValida = true;
                    continue;
                }

                System.out.println("Vericando el tipo condicion...");
                if (param.getTipoCondicionRequerido() == TipoCondicionRequerido.ALGUNOS && excepcionValida) {
                    System.out.println("Validacion cumplida, tipo de condicion algunos y la validacion fue exitosa");
                    break;
                }

                if (param.getTipoCondicionRequerido() == TipoCondicionRequerido.TODOS && !excepcionValida) {
                    System.out.println("Validacion incumplida, tipo de condicion todos y la validacion fue fallida");
                    validaParametroCondicionado = false;
                    break parametros;
                }

            }

            validaParametroCondicionado = excepcionValida;

            if (!excepcionValida) {
                System.out.println("Validacion fallida");
                break parametros;
            }

        }

        if (!validaParametroCondicionado) {
            contextData.getMotivos().add(ParametrosUSConstantes.Motivos.PARAMETRO_REQUERIDO_NO_PROPORCIONADO);
        }
        return validaParametroCondicionado;
    }

    private String getKeybyValue(Map<String, Integer> map, Integer value) {
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected boolean esRangoFechaValida(LocalDate fechaInicial, LocalDate fechaFinal){
        System.out.println("Entering ");

        System.out.println("Verificando si la fecha inicial es posterior a la final..");
        if(fechaInicial.compareTo(fechaFinal) > 0){
            System.out.println("La fecha inicial es posterior a la final..");
            return false;
        }
        System.out.println("Fecha validada exitosamente");
        return true;
    }

    protected boolean esCantidadDiasFechaValido(LocalDate fechaInicial, LocalDate fechaFinal, int servicioId){

        System.out.println("Buscando la cantidad maxima de dias entre las fechas");
        String valor = serviciosContext.getParametroES().buscarValorParametro(
                ParametrosUSConstantes.Parametros.CANTIDAD_MAXIMA_DIAS_ENTRE_RANGO_FECHAS_CONSULTA, null, servicioId).getValor();

        System.out.println("Validando que la fecha no exceda en tiempo maximo de : " + valor);
        if(Integer.parseInt(valor) <=  FechaUtil.diferenciaEnDiasEntreFechas(fechaInicial, fechaFinal)){
            System.out.println("Fecha excede tiempo maximo");
            return false;
        }
        System.out.println("Fechas validadas exitosamente");
        System.out.println("Fecha validada exitosamente");
        return true;
    }

    @Override
    public boolean registrarEjecucionIntercambioInformacion() {
        System.out.println("Entering ");
        boolean registroExitoso = false;

        EjecucionIntercambioInformacion ejecucion = new EjecucionIntercambioInformacion();
        ParametroEjecucionIntercambioInformacion paramEjecucion;
        List<ParametroEjecucionIntercambioInformacion> parametrosEjecucion = new ArrayList<>();

        ejecucion.setFechaInicio(contextData.getFechaEjecucion());
        ejecucion.setCodigoServicio(contextData.getSolicitud().getServicioId());
        ejecucion.setServicioId(contextData.getServicioId());
        ejecucion.setIntercambioInformacionId(contextData.getIntercambio());
        if(!ValidationUtil.isNullOrEmptyList(contextData.getSolicitud().getParametrosEjecucion())){
            System.out.println("Iterando lista de Parametros del Intercambio Informacion, con tama�o: " + contextData.getSolicitud().getParametrosEjecucion().size());

            for(ParametroEjecucion parametro : contextData.getSolicitud().getParametrosEjecucion()){

                paramEjecucion = new ParametroEjecucionIntercambioInformacion();
                paramEjecucion.setCodigoParametro(parametro.getNombre());
                paramEjecucion.setValor(parametro.getValor());

                if(contextData.getIdParametrosIntercambio().containsKey(parametro.getNombre().toUpperCase(Locale.ROOT))){
                    paramEjecucion.setParametroIntercambioInformacionId(contextData.getIdParametrosIntercambio().get(parametro.getNombre().toUpperCase(Locale.ROOT)));

                }

                parametrosEjecucion.add(paramEjecucion);
            }
            ejecucion.getParametrosEjecucion().addAll(parametrosEjecucion);

        }

        System.out.println("Determinado el estado de la solicitud...");
        if(ValidationUtil.isNullOrEmptyList(contextData.getMotivos())){
            System.out.println("Solicitud en estado pendiente");
            ejecucion.setEstado(ParametrosUSConstantes.Estados.ESTADO_PE);
        }else{
            System.out.println("Solicitud en estado rechazada, asignando motivo...");
            ejecucion.setEstado(ParametrosUSConstantes.Estados.ESTADO_RE);
            ejecucion.setFechaFin(LocalDate.now());
            ejecucion.setMotivoId(contextData.getMotivos().get(0));
        }

        System.out.println("Registrando la ejecucion de intercambio de informacion.");
        System.out.println("Buscando el usuario que relizo la llamada....");
        Usuario usuario = serviciosContext.getUsuarioES().buscarUsuarioPorCodigo(contextData.getSolicitud().getCodigoUsuario(), false).get();
        ejecucion.setUsuarioId(usuario.getUsuarioId());

        long ejecucionId = serviciosContext.getEjecucionIntercambioInformacionES().registrarEjecucionIntercambioInformacion(ejecucion).get().getEjecucionIntercambioInfoId();
        System.out.println("Ejecucion registrada exitosamente!");
        System.out.println("Buscando la ejecucion registrada...");
        ejecucion = serviciosContext.getEjecucionIntercambioInformacionES().buscarEjecucionIntercambioInformacionPorId(ejecucionId).get();
        ejecucion.setIntercambioInformacionId(contextData.getIntercambio());

        contextData.setEjecucionIntercambioRegistrada(ejecucion);

        registroExitoso = true;
        return registroExitoso;
    }

    @Override
    public boolean ponerIntercambioInformacionEnCola() {
        System.out.println("Entering ");
        boolean exitoso = true;
        String nombreCola = null;
        try {
            nombreCola = obtenerNombreCola();
        } catch (InternalServiceException e) {
            System.out.println("Error opteniendoo onombre cola..: "+ e.getMessage());
        }
        System.out.println("Convirtiendo la ejecucion de intercambion registrada "+ contextData.getEjecucionIntercambioRegistrada() +" en xml");
        String mensaje = ParseXML.obtenerXMLStringDesdeObjeto(contextData.getEjecucionIntercambioRegistrada());

        System.out.println("Publicando informaci�n con ID: " + contextData.getEjecucionIntercambioRegistrada().getEjecucionIntercambioInfoId() + " en la cola: " + nombreCola);
        serviciosContext.getSolicitudServicioUS().registrarSolicitudServicio(new SolicitudServicio(mensaje, nombreCola, false));
        System.out.println("Informaci�n con ID: " + contextData.getEjecucionIntercambioRegistrada().getEjecucionIntercambioInfoId() + " publicada exitosamente en la cola: " + nombreCola);
        return exitoso;
    }

    @Override
    public void setContextData(ContextData contextData) {
        this.contextData = contextData;
    }

    @Override
    public ContextData getContextData() {
        return this.contextData;
    }

    @Override
    public void setServiciosContext(ServiciosContext serviciosContext) {
        this.serviciosContext = serviciosContext;
    }

    @Override
    public ServiciosContext getServiciosContext() {
        return this.serviciosContext;
    }


    public abstract String obtenerNombreCola() throws InternalServiceException;

    public abstract short obtenerTipoIntercambio();
}

