package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.CambioEstado;
import com.ppai.ppai3.entities.Cliente;
import com.ppai.ppai3.entities.Encuesta;
import com.ppai.ppai3.entities.RespuestaCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LlamadaDto {
    private int llamadaId;
    private String descripcinoOperador;
    private String detalleAccionRequerida;
    private float duracion;
//    private Encuesta encuestaEnviada;
    private String observacionAuditor;
    private List<RespuestaCliente> respuestasCliente;
    private Cliente cliente;
    private List<CambioEstado> cambiosEstado;
}
