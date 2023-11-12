package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.Estado;
import com.ppai.ppai3.entities.Llamada;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CambioEstadoDto {
    private int cambioEstadoId;
    private String fechaHoraInicio;
    private Estado estado;
    private Llamada llamada;
}
