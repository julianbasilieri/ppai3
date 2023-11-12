package com.ppai.ppai3.services.transformations.Cliente;

import com.ppai.ppai3.entities.Cliente;
import com.ppai.ppai3.entities.dtos.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ClienteMapper implements Function<ClienteDto, Cliente> {
    @Override
    public Cliente apply(ClienteDto clienteDto) {
        return new Cliente(clienteDto.getDni(),
                clienteDto.getNombreCompleto(),
                clienteDto.getNroCelular());
    }
}
