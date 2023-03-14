package io.wdefassio.msclients.infra.repository;

import io.wdefassio.msclients.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
