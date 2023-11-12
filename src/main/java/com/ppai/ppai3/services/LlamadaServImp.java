package com.ppai.ppai3.services;

import com.ppai.ppai3.entities.GestorConsultarEncuesta;
import com.ppai.ppai3.entities.Llamada;
import com.ppai.ppai3.entities.dtos.LlamadaDto;
import com.ppai.ppai3.entities.dtos.LlamadaPeriodoRespuesta;
import com.ppai.ppai3.repositories.LlamadaRepository;
import com.ppai.ppai3.services.transformations.Llamada.LlamadaDtoMapper;
import com.ppai.ppai3.services.transformations.Llamada.LlamadaDtoPeriodoRespuestaMapper;
import com.ppai.ppai3.services.transformations.Llamada.LlamadaMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LlamadaServImp implements LlamadaServ {
    private final LlamadaRepository llamadaRepository;
    private final LlamadaDtoMapper llamadaDtoMapper;
    private final LlamadaMapper llamadaMapper;
    private final LlamadaDtoPeriodoRespuestaMapper llamadaDtoPeriodoRespuestaMapper;
    private final GestorConsultarEncuesta gestorConsultarEncuesta;

    public LlamadaServImp(LlamadaRepository llamadaRepository, LlamadaDtoMapper llamadaDtoMapper, LlamadaMapper llamadaMapper, LlamadaDtoPeriodoRespuestaMapper llamadaDtoPeriodoRespuestaMapper, GestorConsultarEncuesta gestorConsultarEncuesta) {
        this.llamadaRepository = llamadaRepository;
        this.llamadaDtoMapper = llamadaDtoMapper;
        this.llamadaMapper = llamadaMapper;
        this.llamadaDtoPeriodoRespuestaMapper = llamadaDtoPeriodoRespuestaMapper;
        this.gestorConsultarEncuesta = gestorConsultarEncuesta;
    }

    @Override
    public List<LlamadaDto> getAll() {
        List<Llamada> llamadas = llamadaRepository.findAll();
        return llamadas
                .stream()
                .map(llamadaDtoMapper)
                .toList();
    }

    @Override
    public LlamadaDto getById(Integer id) {
        Optional<Llamada> llamada = llamadaRepository.findById(id);
        return llamada
                .map(llamadaDtoMapper)
                .orElseThrow();
    }
    @Override
    public List<LlamadaPeriodoRespuesta> getByPeriodoYRespuestas(String fechaInicio, String fechaFin) {
        LocalDate fechaInicioParsed = LocalDate.parse(fechaInicio);
        LocalDate fechaFinParsed = LocalDate.parse(fechaFin);
        gestorConsultarEncuesta.tomarSeleccionFechas(fechaInicioParsed, fechaFinParsed);

        List<Llamada> llamadas = llamadaRepository.findAll();

        // Utiliza la lógica existente para filtrar llamadas por periodo
        List<Llamada> llamadasEnPeriodo = gestorConsultarEncuesta.buscarLlamadasConEncuestaRespondida(llamadas);

        // Mapea las llamadas a DTOs
        return llamadasEnPeriodo
                .stream()
                .map(llamadaDtoPeriodoRespuestaMapper)
                .toList();
    }
}
