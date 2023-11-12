package com.ppai.ppai3.services.transformations.CambioEstado;

import com.ppai.ppai3.entities.CambioEstado;
import com.ppai.ppai3.entities.dtos.CambioEstadoDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class CambioEstadoMapper implements Function<CambioEstadoDto, CambioEstado> {
    @Override
    public CambioEstado apply(CambioEstadoDto cambioEstadoDto) {
        return new CambioEstado(cambioEstadoDto.getCambioEstadoId(),
                cambioEstadoDto.getFechaHoraInicio(),
                cambioEstadoDto.getEstado(),
                cambioEstadoDto.getLlamada());
    }
}
