package com.ppai.ppai3.controllers;

import com.ppai.ppai3.entities.dtos.LlamadaDto;
import com.ppai.ppai3.entities.dtos.LlamadaPeriodoRespuesta;
import com.ppai.ppai3.services.LlamadaServ;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/llamada")
public class LlamadaController {
    private final LlamadaServ llamadaServ;

    public LlamadaController(LlamadaServ llamadaServ) {
        this.llamadaServ = llamadaServ;
    }

    @GetMapping
    public ResponseEntity<List<LlamadaDto>> getAll() {
        List<LlamadaDto> values = llamadaServ.getAll();
        return ResponseEntity.ok(values);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LlamadaDto> getById(@PathVariable("id") int id) {
        LlamadaDto value = llamadaServ.getById(id);
        return ResponseEntity.ok(value);
    }
    @GetMapping("/selec")
    public ResponseEntity<List<LlamadaPeriodoRespuesta>> getById(@RequestParam("fi") String fi, @RequestParam("ff") String ff) {
        List<LlamadaPeriodoRespuesta> values = llamadaServ.getByPeriodoYRespuestas(fi, ff);
        return ResponseEntity.ok(values);
    }
}
