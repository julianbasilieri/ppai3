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
@Table(name = "cambios_estado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CambioEstado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "cambios_estado", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "cambio_estado_id")
    @Column(name = "cambio_estado_id")
    private int cambioEstadoId;
    @Column(name = "fecha_hora_inicio")
    private String fechaHoraInicio;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    private Estado estado;
    @ManyToOne
    @JoinColumn(name = "llamada_id")
    @JsonIgnore
    private Llamada llamada;

    public LocalDateTime getFechaHoraInicioComoLocalDateTime() {
        // Define el formato de fecha que estás utilizando en tu base de datos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Convierte la fecha de texto a LocalDate
        return LocalDateTime.parse(fechaHoraInicio, formatter);
    }
}
