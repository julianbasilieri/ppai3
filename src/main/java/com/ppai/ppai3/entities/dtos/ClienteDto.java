package com.ppai.ppai3.entities.dtos;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    private int dni;
    private String nombreCompleto;
    private String nroCelular;
}
