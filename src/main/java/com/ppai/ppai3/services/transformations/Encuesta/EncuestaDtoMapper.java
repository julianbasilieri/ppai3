package com.ppai.ppai3.services.transformations.Encuesta;

import com.ppai.ppai3.entities.Encuesta;
import com.ppai.ppai3.entities.dtos.EncuestaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class EncuestaDtoMapper implements Function<Encuesta, EncuestaDto> {
    @Override
    public EncuestaDto apply(Encuesta encuesta) {
        return new EncuestaDto(encuesta.getEncuestaId(),
                encuesta.getDescripcion(),
                encuesta.getFechaFinVigencia(),
                encuesta.getPreguntas());
    }
}
