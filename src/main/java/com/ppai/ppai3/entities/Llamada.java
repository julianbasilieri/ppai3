package com.ppai.ppai3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "llamadas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Llamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "llamadas", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "llamada_id")
    @Column(name = "descripcion_operador")
    private String descripcinoOperador;
    @Column(name = "detalle_accion_requerida")
    private String detalleAccionRequerida;
    private float duracion;
    private Encuesta encuestaEnviada;
    @Column(name = "observacion_auditor")
    private String observacionAuditor;
    @OneToMany(mappedBy = "llamada")
    private List<RespuestaCliente> respuestasCliente;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni_cliente")
    private Cliente cliente;
    @OneToMany(mappedBy = "llamada")
    private List<CambioEstado> cambiosEstado;
}
