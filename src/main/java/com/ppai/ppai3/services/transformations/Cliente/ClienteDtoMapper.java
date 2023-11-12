package com.ppai.ppai3.services.transformations.Cliente;

import ch.qos.logback.core.net.server.Client;
import com.ppai.ppai3.entities.Cliente;
import com.ppai.ppai3.entities.dtos.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ClienteDtoMapper implements Function<Cliente, ClienteDto> {
    @Override
    public ClienteDto apply(Cliente client) {
        return new ClienteDto(client.getDni(),
                client.getNombreCompleto(),
                client.getNroCelular());
    }
}
