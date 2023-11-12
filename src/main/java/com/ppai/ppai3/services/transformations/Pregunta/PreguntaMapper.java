package com.ppai.ppai3.services.transformations.Pregunta;

import com.ppai.ppai3.entities.Pregunta;
import com.ppai.ppai3.entities.dtos.PreguntaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class PreguntaMapper implements Function<PreguntaDto, Pregunta> {
    @Override
    public Pregunta apply(PreguntaDto preguntaDto) {
        return new Pregunta(preguntaDto.getPreguntaId(),
                preguntaDto.getPregunta(),
                preguntaDto.getEncuesta(),
                preguntaDto.getRespuestasPosibles());
    }
}
