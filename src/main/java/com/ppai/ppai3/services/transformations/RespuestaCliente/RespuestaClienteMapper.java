package com.ppai.ppai3.services.transformations.RespuestaCliente;

import com.ppai.ppai3.entities.RespuestaCliente;
import com.ppai.ppai3.entities.dtos.RespuestaClienteDto;

import java.util.function.Function;

public class RespuestaClienteMapper implements Function<RespuestaClienteDto, RespuestaCliente> {
    @Override
    public RespuestaCliente apply(RespuestaClienteDto respuestaClienteDto) {
        return new RespuestaCliente(respuestaClienteDto.getRespuestaClienteId(),
                respuestaClienteDto.getFechaEncuesta(),
                respuestaClienteDto.getRespuestaPosible(),
                respuestaClienteDto.getLlamada());
    }
}
