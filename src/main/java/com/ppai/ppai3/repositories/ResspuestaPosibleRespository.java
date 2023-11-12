package com.ppai.ppai3.repositories;

import com.ppai.ppai3.entities.RespuestaPosible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResspuestaPosibleRespository extends JpaRepository<RespuestaPosible, Integer> {
}
