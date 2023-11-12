package com.ppai.ppai3.services.transformations.CambioEstado;

import com.ppai.ppai3.entities.CambioEstado;
import com.ppai.ppai3.entities.dtos.CambioEstadoDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class CambioEstadoDtoMapper implements Function<CambioEstado, CambioEstadoDto> {
    @Override
    public CambioEstadoDto apply(CambioEstado cambioEstado) {
        return new CambioEstadoDto(cambioEstado.getCambioEstadoId(),
                cambioEstado.getFechaHoraInicio(),
                cambioEstado.getEstado(),
                cambioEstado.getLlamada());
    }
}
