package com.ppai.ppai3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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
    private LocalDateTime fechahoraInicio;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    private Estado estado;
    @ManyToOne
    @JoinColumn(name = "llamada_id")
    private Llamada llamada;
}
