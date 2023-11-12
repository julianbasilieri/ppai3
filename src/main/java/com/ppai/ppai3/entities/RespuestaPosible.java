package com.ppai.ppai3.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "respuestas_posibles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaPosible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "respuestasPosibles", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "respuesta_posible_id")
    @Column(name = "respuesta_posible_id")
    private int respuestaPosibleId;
    private String descripcion;
    private int valor;
    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    @JsonIgnore
    private Pregunta pregunta;

    public String getDescripcionRta() {
        return getPregunta().getDescripcion();
    }
}
