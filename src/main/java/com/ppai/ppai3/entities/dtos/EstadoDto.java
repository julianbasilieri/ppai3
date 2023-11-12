package com.ppai.ppai3.entities.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDto {
    private int estadoId;
    private String nombre;
}
