package com.ppai.ppai3.services.transformations.RespuestaPosible;

import com.ppai.ppai3.entities.RespuestaPosible;
import com.ppai.ppai3.entities.dtos.RespuestaPosibleDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class RespuestaPosibleMapper implements Function<RespuestaPosible, RespuestaPosibleDto> {
    @Override
    public RespuestaPosibleDto apply(RespuestaPosible respuestaPosible) {
        return new RespuestaPosibleDto(respuestaPosible.getRespuestaPosibleId(),
                respuestaPosible.getDescripcion(),
                respuestaPosible.getValor(),
                respuestaPosible.getPregunta());
    }
}
