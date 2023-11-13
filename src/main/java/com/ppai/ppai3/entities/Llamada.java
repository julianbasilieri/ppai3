package com.ppai.ppai3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
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
    @Column(name = "llamada_id")
    private int llamadaId;
    @Column(name = "descripcion_operador")
    private String descripcinoOperador;
    @Column(name = "detalle_accion_requerida")
    private String detalleAccionRequerida;
    private float duracion;
    @Column(name = "observacion_auditor")
    private String observacionAuditor;
    @OneToMany(mappedBy = "llamada")
    private List<RespuestaCliente> respuestasCliente;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni_cliente")
    private Cliente cliente;
    @OneToMany(mappedBy = "llamada")
    private List<CambioEstado> cambiosEstado;

    public boolean esDePeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        LocalDateTime estadoInicial = this.determinarEstadoInicial();

        // Verifica si la fecha inicial determinada está dentro del período.
        return estadoInicial != null && estadoInicial.toLocalDate().isAfter(fechaInicio) && estadoInicial.toLocalDate().isBefore(fechaFin);
    }
    public LocalDateTime determinarEstadoInicial() {
        final List<LocalDateTime> cambiosEstado = getCambiosEstado().stream().map(CambioEstado::getFechaHoraInicioComoLocalDateTime).toList();
        return Collections.min(cambiosEstado);
    }
    public boolean tieneRespuestas() {
        return respuestasCliente != null && !respuestasCliente.isEmpty();
    }

    public String getNombreClienteDeLlamada() {
        return getCliente().getNombreCompleto();
    }
    public String determinarUltimoEstado() {
        CambioEstado ultimoCambioEstado = Collections.max(cambiosEstado, Comparator.comparing(CambioEstado::getFechaHoraInicio));
        return ultimoCambioEstado.getEstado().getNombre();
    }
    public float getDuracion() {
        return duracion;
    }
    public String getRespuestas() {
        return getRespuestasCliente().stream().map(RespuestaCliente::getDescipcionRta).toString();
    }
}
