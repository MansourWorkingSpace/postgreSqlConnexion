package com.example.postgresqlconnexion.Services;

import com.example.postgresqlconnexion.Model.Client;

public interface ClientService {
    public long count();
    public Client add(Client cl);

}
