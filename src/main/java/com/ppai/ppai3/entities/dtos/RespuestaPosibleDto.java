package com.ppai.ppai3.entities.dtos;
import com.ppai.ppai3.entities.Pregunta;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaPosibleDto {
    private int respuestaPosibleId;
    private String descripcion;
    private int valor;
    private Pregunta pregunta;
}
