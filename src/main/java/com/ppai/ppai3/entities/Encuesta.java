package com.ppai.ppai3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String descipcion;
    @Column(name = "fecha_fin_vigencia")
    private Date fechaFinVigencia;
    @OneToMany(mappedBy = "encuesta")
    private List<Pregunta> preguntas;
}
