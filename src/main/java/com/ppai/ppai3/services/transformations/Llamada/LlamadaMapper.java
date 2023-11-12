package com.ppai.ppai3.services.transformations.Llamada;

import com.ppai.ppai3.entities.Llamada;
import com.ppai.ppai3.entities.dtos.LlamadaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class LlamadaMapper implements Function<LlamadaDto, Llamada> {
    @Override
    public Llamada apply(LlamadaDto llamadaDto) {
        return new Llamada(llamadaDto.getLlamadaId(),
                llamadaDto.getDescripcinoOperador(),
                llamadaDto.getDetalleAccionRequerida(),
                llamadaDto.getDuracion(),
//                llamadaDto.getEncuestaEnviada(),
                llamadaDto.getObservacionAuditor(),
                llamadaDto.getRespuestasCliente(),
                llamadaDto.getCliente(),
                llamadaDto.getCambiosEstado());
    }
}
