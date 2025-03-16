package com.example.postgresqlconnexion.Repository;

import com.example.postgresqlconnexion.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
