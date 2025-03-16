package com.example.postgresqlconnexion.Controller;

import com.example.postgresqlconnexion.Model.Client;
import com.example.postgresqlconnexion.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        return clientService.add(client);
    }

    @GetMapping("/count")
    public long countClients() {
        return clientService.count();
    }
}
