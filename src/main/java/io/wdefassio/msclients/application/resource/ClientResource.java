package io.wdefassio.msclients.application.resource;

import io.wdefassio.msclients.application.resource.representation.ClientCreateRequest;
import io.wdefassio.msclients.application.service.ClientService;
import io.wdefassio.msclients.domain.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientResource {

    private final ClientService clientService;

    @GetMapping
    public String status() {
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientCreateRequest request) {
        return new ResponseEntity<>(clientService.save(request.toModel()), HttpStatus.CREATED);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Client> getByCpf(@PathVariable String cpf) {
        return new ResponseEntity<>(clientService.getByCpf(cpf), HttpStatus.OK);
    }

}
