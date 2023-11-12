package com.ppai.ppai3.entities.dtos;

import com.ppai.ppai3.entities.CambioEstado;
import com.ppai.ppai3.entities.Cliente;
import com.ppai.ppai3.entities.Encuesta;
import com.ppai.ppai3.entities.RespuestaCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LlamadaPeriodoRespuesta {
    private int llamadaId;
    private float duracion;
    private List<RespuestaClientePeriodoRespuesta> respuestasCliente;
    private String cliente;
    private String estado;
}
