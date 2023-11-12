package com.ppai.ppai3.entities;

import com.ppai.ppai3.interfaces.IIterador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class IteradorLlamada implements IIterador {
    private int actual;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private List<Llamada> llamadas;
    @Override
    public void primero() {
        actual = 0;
    }

    @Override
    public boolean haTerminado() {
        return actual >= llamadas.size();
    }

    @Override
    public void siguiente() {
        actual++;
    }

    @Override
    public Llamada actual() {
        return llamadas.get(actual);
    }

    @Override
    public boolean cumpleFiltros(LocalDate fechaInicioPeriodo, LocalDate fechaFinPerido, Llamada llamada) {
        return (llamada.esDePeriodo(fechaInicioPeriodo, fechaFinPerido) && llamada.tieneRespuestas());
    }

    public IteradorLlamada(List<Llamada> llamadas) {
        this.actual = 0;
        this.llamadas = llamadas;
    }
}
