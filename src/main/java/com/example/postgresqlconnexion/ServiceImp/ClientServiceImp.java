package com.example.postgresqlconnexion.ServiceImp;

import com.example.postgresqlconnexion.Model.Client;
import com.example.postgresqlconnexion.Repository.ClientRepository;
import com.example.postgresqlconnexion.Services.ClientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientServiceImp implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public long count() {
        return clientRepository.count();
    }

    @Override
    public Client add(Client cl) {
        return clientRepository.save(cl);
    }
}