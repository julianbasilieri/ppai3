package com.ppai.ppai3.repositories;

import com.ppai.ppai3.entities.RespuestaCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaClienteRepository extends JpaRepository<RespuestaCliente, Integer> {
}
