package io.wdefassio.msclients.application.resource.representation;

import io.wdefassio.msclients.domain.Client;
import lombok.Data;

@Data
public class ClientCreateRequest {
    private String cpf;
    private String name;
    private String age;

    public Client toModel() {
        return Client.builder()
                .name(name)
                .age(age)
                .cpf(cpf)
                .build();
    }

}
