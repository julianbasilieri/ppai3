package com.ppai.ppai3.services.transformations.Pregunta;

import com.ppai.ppai3.entities.Pregunta;
import com.ppai.ppai3.entities.dtos.PreguntaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class PreguntaDtoMapper implements Function<Pregunta, PreguntaDto> {
    @Override
    public PreguntaDto apply(Pregunta pregunta) {
        return new PreguntaDto(pregunta.getPreguntaId(),
                pregunta.getPregunta(),
                pregunta.getEncuesta(),
                pregunta.getRespuestasPosibles());
    }
}
