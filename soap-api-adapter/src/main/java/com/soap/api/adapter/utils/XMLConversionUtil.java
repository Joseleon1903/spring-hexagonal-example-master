package com.soap.api.adapter.utils;


import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoOutput;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.RespuestaCarteraAfiliadoType;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.RespuestaPaginacionType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class XMLConversionUtil {

    public static ConsultarCarteraAfiliadoPorPeriodoOutput crearResponse(ConsultarCarteraAfiliadoPorPeriodoResponse response){

        ConsultarCarteraAfiliadoPorPeriodoOutput type = new ConsultarCarteraAfiliadoPorPeriodoOutput();
        RespuestaPaginacionType paginacion =  new RespuestaPaginacionType();
        paginacion.setIndice(response.getRegistrosRestantes().getIndice());
        paginacion.setRegistrosRestantes(response.getRegistrosRestantes().getRegistrosRestantes());
        type.setRegistrosRestantes(paginacion);

        List<RespuestaCarteraAfiliadoType> respuestaCarteraAfiliados = new ArrayList<>();

        response.getRespuestaCarteraAfiliados().forEach( dato ->{
            RespuestaCarteraAfiliadoType resp = new RespuestaCarteraAfiliadoType();


            resp.setSolicitudId(dato.getSolicitudId());
            resp.setNss(dato.getNss());
            resp.setNombre(dato.getNombre());
            resp.setPrimerApellido(dato.getPrimerApellido());
            resp.setEstadoAfiliacion(dato.getEstadoAfiliacion());
            resp.setMotivoEstadoId(dato.getMotivoEstadoId());
            resp.setFechaEfectividadAfiliacion(convert(dato.getFechaEfectividadAfiliacion()));
            respuestaCarteraAfiliados.add(resp);
        });

        type.getRespuestaCarteraAfiliados().addAll(respuestaCarteraAfiliados);
        return type;
    }

    public static XMLGregorianCalendar convert(LocalDate localDate) {
        if(localDate == null){
            return null;
        }
        try {
            GregorianCalendar gc = GregorianCalendar.from(
                    localDate.atStartOfDay(ZoneId.systemDefault())
            );
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//
//    public static ConsultarCarteraAfiliadoPorPeriodo createRequest(ConsultarCarteraAfiliadoPorPeriodoType type){
//        ConsultarCarteraAfiliadoPorPeriodo input = new ConsultarCarteraAfiliadoPorPeriodo();
//        input.setPeriodo(type.getPeriodo());
//        input.setEstadoAfiliacion(type.getEstadoAfiliacion());
//        input.setIndice(type.getIndice());
//        return input;
//    }


}
