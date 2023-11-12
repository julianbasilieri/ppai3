package com.ppai.ppai3.services.transformations.Encuesta;

import com.ppai.ppai3.entities.Encuesta;
import com.ppai.ppai3.entities.dtos.EncuestaDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class EncuestaMapper implements Function<EncuestaDto, Encuesta> {
    @Override
    public Encuesta apply(EncuestaDto encuestaDto) {
        return new Encuesta(encuestaDto.getEncuestaId(),
                encuestaDto.getDescripcion(),
                encuestaDto.getFechaFinVigencia(),
                encuestaDto.getPreguntas());
    }
}
