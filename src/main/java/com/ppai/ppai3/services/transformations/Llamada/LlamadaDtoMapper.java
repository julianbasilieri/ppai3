package com.ppai.ppai3.services.transformations.Llamada;

import com.ppai.ppai3.entities.Llamada;
import com.ppai.ppai3.entities.dtos.LlamadaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class LlamadaDtoMapper implements Function<Llamada, LlamadaDto> {
    @Override
    public LlamadaDto apply(Llamada llamada) {
        return new LlamadaDto(llamada.getLlamadaId(),
                llamada.getDescripcinoOperador(),
                llamada.getDetalleAccionRequerida(),
                llamada.getDuracion(),
//                llamada.getEncuestaEnviada(),
                llamada.getObservacionAuditor(),
                llamada.getRespuestasCliente(),
                llamada.getCliente(),
                llamada.getCambiosEstado());
    }
}
