package com.ppai.ppai3.services.transformations.RespuestaCliente;

import com.ppai.ppai3.entities.RespuestaCliente;
import com.ppai.ppai3.entities.dtos.RespuestaClientePeriodoRespuesta;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class RespuestaClienteDtoPeriodoRespuesta implements Function<RespuestaCliente, RespuestaClientePeriodoRespuesta> {

    @Override
    public RespuestaClientePeriodoRespuesta apply(RespuestaCliente respuestaCliente) {
        return new RespuestaClientePeriodoRespuesta(respuestaCliente.getRespuestaPosible().getPregunta().getEncuesta().getDescripcion(),
                respuestaCliente.getRespuestaPosible().getPregunta().getPregunta(),
                respuestaCliente.getRespuestaPosible().getDescripcion());
    }
}
