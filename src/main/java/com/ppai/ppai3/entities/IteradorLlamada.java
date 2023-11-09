package com.ppai.ppai3.entities;

import com.ppai.ppai3.interfaces.IIterador;

import java.util.Date;
import java.util.List;

public class IteradorLlamada implements IIterador {
    private int actual;
    private Date fechaIncio;
    private Date fechaFin;
    private List<Llamada> llamadas;
    @Override
    public void primero() {
        actual = 1;
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
    public Object actual() {
        return llamadas.get(actual);
    }

    @Override
    public boolean cumpleFiltros(Date fechaInicioPeriodo, Date fechaFinPerido, Date fechaCambioEstado) {
        return false;
    }

    public IteradorLlamada(List<Llamada> llamadas, Date fechaIncio, Date fechaFin) {
        this.actual = 0;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.llamadas = llamadas;
    }
}
