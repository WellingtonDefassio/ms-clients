package io.wdefassio.msclients.application.service;

import io.wdefassio.msclients.application.resource.ClientResource;
import io.wdefassio.msclients.domain.Client;
import io.wdefassio.msclients.exception.InvalidCpfException;
import io.wdefassio.msclients.infra.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client save(Client client) {
        return clientRepository.save(client);
    }
    public Client getByCpf(String cpf) {
        return clientRepository.findByCpf(cpf).orElseThrow(() -> new InvalidCpfException(cpf));
    }
}
