package com.ppai.ppai3.entities;

import com.opencsv.CSVWriter;
import com.ppai.ppai3.interfaces.IAgregado;
import com.ppai.ppai3.interfaces.IIterador;
import org.springframework.stereotype.Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
@Controller
public class GestorConsultarEncuesta implements IAgregado {
    private List<Llamada> llamadas;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Llamada llamadaSeleccionada;
    private String cliente;
    private String ultimoEstado;
    private float duracion;
    private String respuestasCliente;
    private String formaGeneracion;

    public void consultarEncuesta() {
    }
    public void tomarSeleccionFechas(LocalDate fechaIni, LocalDate fechaF) {
        fechaInicio = fechaIni;
        fechaFin = fechaF;
    }
    public List<Llamada> buscarLlamadasConEncuestaRespondida(List<Llamada> llamadas) {
        this.llamadas = llamadas;
        List<Llamada> llamadasConEncuestaRespodida = new ArrayList<>();
        final IteradorLlamada iterador = (IteradorLlamada) crearIterador(Collections.singletonList(llamadas));
        iterador.primero();
        while (!iterador.haTerminado()) {
            iterador.actual();
            if (iterador.cumpleFiltros(fechaInicio, fechaFin, iterador.actual())) {
                llamadasConEncuestaRespodida.add(iterador.actual());
            }
            iterador.siguiente();
        }
        return llamadasConEncuestaRespodida;
    }
    @Override
    public IIterador crearIterador(List<Object> elementos) {
        return new IteradorLlamada(llamadas);
    }
    public void tomarSeleccionLlamada(Llamada llamada) {
        llamadaSeleccionada = llamada;
    }
    public void buscarClienteDeLlamada() {
        cliente = llamadaSeleccionada.getNombreClienteDeLlamada();
    }
    public void buscarUltimoEstado() {
        ultimoEstado = llamadaSeleccionada.determinarUltimoEstado();
    }
    public void buscarDuracion() {
        duracion = llamadaSeleccionada.getDuracion();
    }
    public void buscarDatosRespuestaCliente() {
        respuestasCliente = llamadaSeleccionada.getRespuestas();
    }
    public void tomarSeleccionFormaGeneracionEncuesta(String fg) {
        formaGeneracion = fg;
    }
    public void generarConsultaEncuesta() {
        String escritorio = System.getProperty("user.home") + "/Desktop/";

        // Concatenar el nombre del archivo CSV a la ruta del escritorio
        String rutaArchivo = escritorio + "mi_archivo.csv";

        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(rutaArchivo))) {
            // Cabeceras del archivo CSV
            String[] encabezados = {"Cliente", "Ultimo Estado", "Duracion", "Encuesta", "Pregunta", "Respuesta"};

            csvWriter.writeNext(encabezados);

            // Datos de la llamada seleccionada
            String[] datosLlamada = {cliente, ultimoEstado, String.valueOf(duracion)};

//            // Iterar sobre las respuestas del cliente y obtener la información necesaria
//            for (Encuesta encuesta : respuestasCliente) {
//                for (Pregunta pregunta : encuesta.getPreguntas()) {
//                    for (RespuestaPosible respuestaPosible : pregunta.getRespuestasPosibles()) {
//                        // Agregar los datos al archivo CSV
//                        String[] datos = {cliente, ultimoEstado, String.valueOf(duracion),
//                                encuesta.getDescripcion(), pregunta.getPregunta(), respuestaPosible.getDescripcion()};
//                        csvWriter.writeNext(datos);
//                    }
//                }
//            }

            System.out.println("Archivo CSV generado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción según sea necesario
        }
    }

    public void finCU() {}

}
