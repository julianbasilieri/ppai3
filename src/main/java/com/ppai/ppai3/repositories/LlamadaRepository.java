package com.ppai.ppai3.repositories;

import com.ppai.ppai3.entities.Llamada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LlamadaRepository extends JpaRepository<Llamada, Integer> {
}
