package com.ppai.ppai3.interfaces;

import com.ppai.ppai3.entities.Llamada;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface IIterador {
    void primero();
    boolean haTerminado();
    void siguiente();
    Object actual();
    boolean cumpleFiltros(LocalDate fechaInicioPeriodo, LocalDate fechaFinPerido, Llamada llamada);
}
