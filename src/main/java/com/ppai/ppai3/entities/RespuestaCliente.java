package com.ppai.ppai3.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "respuestas_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "respuestasCliente", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "respuesta_cliente_id")
    @Column(name = "respuesta_cliente_id")
    private int respuestaClienteId;
    @Column(name = "fecha_encuesta")
    private String fechaEncuesta;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "respuesta_posible_id")
    private RespuestaPosible respuestaPosible;
    @ManyToOne
    @JoinColumn(name = "llamada_id")
    @JsonIgnore
    private Llamada llamada;

    public LocalDate getFechaEncuestaComoLocalDate() {
        // Define el formato de fecha que estás utilizando en tu base de datos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convierte la fecha de texto a LocalDate
        return LocalDate.parse(fechaEncuesta, formatter);
    }

    public String getDescipcionRta() {
        return getRespuestaPosible().getDescripcionRta();
    }

}
