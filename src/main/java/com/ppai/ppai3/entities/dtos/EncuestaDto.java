package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.Pregunta;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncuestaDto {
    private int encuestaId;
    private String descripcion;
    private String fechaFinVigencia;
    private List<Pregunta> preguntas;
}
