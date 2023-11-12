package com.ppai.ppai3.services.transformations.Estado;

import com.ppai.ppai3.entities.Estado;
import com.ppai.ppai3.entities.dtos.EstadoDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class EstadoDtoMapper implements Function<Estado, EstadoDto> {
    @Override
    public EstadoDto apply(Estado estado) {
        return new EstadoDto(estado.getEstadoId(),
                estado.getNombre());
    }
}
