package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.TipoCondicionRequerido;
import hexagonaldemo.entity.ParametroIntercambioInformacionEntity;
import hexagonaldemo.entity.TipoCondicionRequeridoEntity;

public class ParametroIntercambioInformacionMapper {


    public static ParametroIntercambioInformacion mapToDomain(ParametroIntercambioInformacionEntity type) {

        ParametroIntercambioInformacion pii = new ParametroIntercambioInformacion();
        pii.setParametroIntercambioInformacionId(type.getParametroIntercambioInformacionId());
       // pii.setIntercambioInformacionId(new IntercambioInformacion(type.intercambioInformacionId));
        pii.setOrden(type.getOrden());
        pii.setNombre(type.getNombre());
        pii.setTipoDato(type.getTipoDato());
        pii.setValidaRango(type.getValidaRango());
        pii.setParametroRango(type.getParametroRango());
        pii.setValidaDiasRango(type.getValidaDiasRango());
        pii.setRequerido(type.isRequerido());
        pii.setRequeridoCondicionado(type.isRequeridoCondicionado());
        if(type.getTipoCondicionRequerido() != null){
            pii.setTipoCondicionRequerido(TipoCondicionRequerido.valueOf(type.getTipoCondicionRequerido().name()));
        }

//        List<ExcepcionParametroRequeridoIntercambioInformacion> excepciones = null;
//        if (type.getExcepcionesParametroRequerido() != null && !type.getExcepcionesParametroRequerido().isEmpty()) {
//            excepciones = new ArrayList<>();
//            for (ExcepcionParametroRequeridoIntercambioInformacionType excepcion : type.excepcionesParametroRequerido) {
//                ExcepcionParametroRequeridoIntercambioInformacion e = excepcion.toEntity();
//                e.setParametroIntercambioInformacionId(pii);
//                excepciones.add(e);
//            }
//            pii.setExcepcionesParametroRequerido(excepciones);
//        }
        pii.setEstado(type.getEstado());
        return pii;
    }

    public static ParametroIntercambioInformacionEntity mapToEntity(ParametroIntercambioInformacion type) {

        ParametroIntercambioInformacionEntity pii = new ParametroIntercambioInformacionEntity();
        pii.setParametroIntercambioInformacionId(type.getParametroIntercambioInformacionId());
        // pii.setIntercambioInformacionId(new IntercambioInformacion(type.intercambioInformacionId));
        pii.setOrden(type.getOrden());
        pii.setNombre(type.getNombre());
        pii.setTipoDato(type.getTipoDato());
        pii.setValidaRango(type.getValidaRango());
        pii.setParametroRango(type.getParametroRango());
        pii.setValidaDiasRango(type.getValidaDiasRango());
        pii.setRequerido(type.isRequerido());
        pii.setRequeridoCondicionado(type.isRequeridoCondicionado());
        pii.setTipoCondicionRequerido(TipoCondicionRequeridoEntity.valueOf(type.getTipoCondicionRequerido().name()));

//        List<ExcepcionParametroRequeridoIntercambioInformacion> excepciones = null;
//        if (type.getExcepcionesParametroRequerido() != null && !type.getExcepcionesParametroRequerido().isEmpty()) {
//            excepciones = new ArrayList<>();
//            for (ExcepcionParametroRequeridoIntercambioInformacionType excepcion : type.excepcionesParametroRequerido) {
//                ExcepcionParametroRequeridoIntercambioInformacion e = excepcion.toEntity();
//                e.setParametroIntercambioInformacionId(pii);
//                excepciones.add(e);
//            }
//            pii.setExcepcionesParametroRequerido(excepciones);
//        }
        pii.setEstado(type.getEstado());
        return pii;
    }
}
