package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.Encuesta;
import com.ppai.ppai3.entities.RespuestaPosible;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreguntaDto {
    private int preguntaId;
    private String pregunta;
    private Encuesta encuesta;
    private List<RespuestaPosible> respuestasPosibles;
}
