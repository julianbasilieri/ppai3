package com.ppai.ppai3.services.transformations.Estado;

import com.ppai.ppai3.entities.Estado;
import com.ppai.ppai3.entities.dtos.EstadoDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class EstadoMapper implements Function<EstadoDto, Estado> {
    @Override
    public Estado apply(EstadoDto estadoDto) {
        return new Estado(estadoDto.getEstadoId(),
                estadoDto.getNombre());
    }
}
