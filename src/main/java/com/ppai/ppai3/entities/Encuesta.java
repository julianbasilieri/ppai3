package com.ppai.ppai3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "encuestas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "encuestas", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "encuesta_id")
    @Column(name = "encuestas_id")
    private int encuestaId;
    private String descripcion;
    @Column(name = "fecha_fin_vigencia")
    private String fechaFinVigencia;
    @OneToMany(mappedBy = "encuesta")
    private List<Pregunta> preguntas;

    public LocalDate getFechaFinVigenciaComoLocalDate() {
        // Define el formato de fecha que estás utilizando en tu base de datos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convierte la fecha de texto a LocalDate
        return LocalDate.parse(fechaFinVigencia, formatter);
    }
}
