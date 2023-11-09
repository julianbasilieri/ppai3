package com.ppai.ppai3.entities;

import com.ppai.ppai3.interfaces.IAgregado;
import com.ppai.ppai3.interfaces.IIterador;

import java.util.Date;
import java.util.List;

public class GestorConsultarEncuesta implements IAgregado {
    private List<Llamada> llamadas;
    private Date fechaInicio;
    private Date fechaFin;
    private Llamada llamadaSeleccionada;
    private Cliente cliente;
    private Estado ultimoEstado;
    private float duracion;
    private RespuestaCliente respuestaCliente;
    private String formaGeneracion;



    public void consultarEncuesta() {}
    public void tomarSeleccionFechas() {}
    public void buscarLlamadasConEncuestaRespondida() {}
    @Override
    public IIterador crearIterador(List<Object> elementos) {
        return new IteradorLlamada(llamadas, fechaInicio, fechaFin);
    }
    public void tomarSeleccionLlamada() {}
    public void buscarClienteDeLlamada() {}
    public void buscarUltimoEstado() {}
    public void buscarDuracion() {}
    public void buscarDatosRespuestaCliente() {}
    public void tomarSeleccionFormaGeneracionEncuesta() {}
    public void generarConsultaEncuesta() {}
    public void finCU() {}

}
