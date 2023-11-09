package com.ppai.ppai3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Column(name = "fecha_encuesta")
    private Date fechaEncuesta;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "respuesta_posible_id")
    private RespuestaPosible respuestaPosible;
    @ManyToOne
    @JoinColumn(name = "llamada_id")
    private Llamada llamada;
}
