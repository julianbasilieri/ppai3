package com.ppai.ppai3.services.transformations.Llamada;

import com.ppai.ppai3.entities.Llamada;

import com.ppai.ppai3.entities.dtos.LlamadaPeriodoRespuesta;
import com.ppai.ppai3.entities.dtos.RespuestaClientePeriodoRespuesta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class LlamadaDtoPeriodoRespuestaMapper implements Function<Llamada, LlamadaPeriodoRespuesta> {
    @Override
    public LlamadaPeriodoRespuesta apply(Llamada llamada) {
        List<RespuestaClientePeriodoRespuesta> respuestasCliente = llamada.getRespuestasCliente().stream()
                .map(respuestaCliente -> new RespuestaClientePeriodoRespuesta(
                        respuestaCliente.getRespuestaPosible().getPregunta().getEncuesta().getDescripcion(),
                        respuestaCliente.getRespuestaPosible().getPregunta().getPregunta(),
                        respuestaCliente.getRespuestaPosible().getDescripcion()
                ))
                .distinct() // Eliminar duplicados
                .toList();
        return new LlamadaPeriodoRespuesta(
                llamada.getLlamadaId(),
                llamada.getDuracion(),
                respuestasCliente,
                llamada.getCliente().getNombreCompleto(),
                llamada.determinarUltimoEstado());
    }
}
