package com.ppai.ppai3.services;

import com.ppai.ppai3.entities.Llamada;
import com.ppai.ppai3.entities.dtos.LlamadaDto;
import com.ppai.ppai3.entities.dtos.LlamadaPeriodoRespuesta;

import java.util.List;

public interface LlamadaServ extends Service<LlamadaDto, Integer> {
    LlamadaPeriodoRespuesta getById(Integer id);
    List<Integer> getByPeriodoYRespuestas(String fechaInicio, String fechaFin);
}
