package com.soap.api.adapter.utils;

import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoResponseType;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoType;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.RespuestaPaginacionType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;

public class XMLConversionUtil {

    public static ConsultarCarteraAfiliadoPorPeriodoResponseType crearResponse(ConsultarCarteraAfiliadoPorPeriodoResponse response){

        ConsultarCarteraAfiliadoPorPeriodoResponseType type = new ConsultarCarteraAfiliadoPorPeriodoResponseType();
        RespuestaPaginacionType paginacion =  new RespuestaPaginacionType();
        paginacion.setIndice(response.getRegistrosRestantes().getIndice());
        paginacion.setRegistrosRestantes(response.getRegistrosRestantes().getRegistrosRestantes());
        type.setRegistrosRestantes(paginacion);



        return null;

    }

    public static ConsultarCarteraAfiliadoPorPeriodo createRequest(ConsultarCarteraAfiliadoPorPeriodoType type){
        ConsultarCarteraAfiliadoPorPeriodo input = new ConsultarCarteraAfiliadoPorPeriodo();
        input.setPeriodo(type.getPeriodo());
        input.setEstadoAfiliacion(type.getEstadoAfiliacion());
        input.setIndice(type.getIndice());
        return input;
    }


}
