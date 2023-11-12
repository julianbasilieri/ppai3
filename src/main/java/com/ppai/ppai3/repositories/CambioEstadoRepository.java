package com.ppai.ppai3.repositories;

import com.ppai.ppai3.entities.CambioEstado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CambioEstadoRepository extends JpaRepository<CambioEstado, Integer> {
}
