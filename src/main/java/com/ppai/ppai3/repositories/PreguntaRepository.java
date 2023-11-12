package com.ppai.ppai3.repositories;

import com.ppai.ppai3.entities.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
}
