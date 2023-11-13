package com.ppai.ppai3.controllers;

import com.ppai.ppai3.entities.GestorConsultarEncuesta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exportar-csv")
public class ExportarCSVController {

    private final GestorConsultarEncuesta gestorConsultarEncuesta;

    public ExportarCSVController(GestorConsultarEncuesta gestorConsultarEncuesta) {
        this.gestorConsultarEncuesta = gestorConsultarEncuesta;
    }

    @GetMapping
    public void exportarCSV() {
        gestorConsultarEncuesta.tomarSeleccionFormaGeneracionEncuesta("CSV");
    }
}
