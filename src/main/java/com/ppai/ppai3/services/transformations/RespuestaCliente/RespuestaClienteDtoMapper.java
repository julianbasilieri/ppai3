package com.ppai.ppai3.services.transformations.RespuestaCliente;

import com.ppai.ppai3.entities.RespuestaCliente;
import com.ppai.ppai3.entities.dtos.RespuestaClienteDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class RespuestaClienteDtoMapper implements Function<RespuestaCliente, RespuestaClienteDto> {
    @Override
    public RespuestaClienteDto apply(RespuestaCliente respuestaCliente) {
        return new RespuestaClienteDto(respuestaCliente.getRespuestaClienteId(),
                respuestaCliente.getFechaEncuesta(),
                respuestaCliente.getRespuestaPosible(),
                respuestaCliente.getLlamada());
    }
}
