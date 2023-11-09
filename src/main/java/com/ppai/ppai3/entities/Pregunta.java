package com.ppai.ppai3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "preguntas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "preguntas", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "pregunta_id")
    private String pregunta;
    @ManyToOne
    @JoinColumn(name = "encuesta_id")
    private Encuesta encuesta;
    @OneToMany(mappedBy = "pregunta")
    private List<RespuestaPosible> respuestasPosibles;
}
