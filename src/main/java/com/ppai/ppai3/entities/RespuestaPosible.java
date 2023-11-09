package com.ppai.ppai3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "respuestasPosibles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaPosible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "respuestasPosibles", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "respuesta_posible_id")
    private String descipcion;
    private int valor;
    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;
}
