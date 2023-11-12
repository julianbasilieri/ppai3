package com.ppai.ppai3.interfaces;

import com.ppai.ppai3.entities.Llamada;

import java.util.List;

public interface IAgregado {
    IIterador crearIterador(List<Object> elementos);
}
