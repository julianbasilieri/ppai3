package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.Llamada;
import com.ppai.ppai3.entities.RespuestaPosible;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaClienteDto {
    private int respuestaClienteId;
    private String fechaEncuesta;
    private RespuestaPosible respuestaPosible;
    private Llamada llamada;
}
