package com.ppai.ppai3.interfaces;

import java.util.Date;
import java.util.List;

public interface IIterador {
    void primero();
    boolean haTerminado();
    void siguiente();
    Object actual();
    boolean cumpleFiltros(Date fechaInicioPeriodo, Date fechaFinPerido, Date fechaCambioEstado);

    boolean cumpleFiltros(Date fechaInicio, Date fechaFin);
}
