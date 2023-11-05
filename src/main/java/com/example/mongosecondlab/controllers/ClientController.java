package com.example.mongosecondlab.controllers;


import com.example.mongosecondlab.models.Client;
import com.example.mongosecondlab.models.ClientsStatistics;
import com.example.mongosecondlab.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/get-all")
    public List<Client> getAll() {
        return clientService.getAllClients();
    }

    @PostMapping("/new-client")
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public String deleteById(@PathVariable String id) {
        clientService.deleteClientById(id);
        return "Client deleted successfully";
    }

    @GetMapping("/get-all-by-status/{status}")
    public List<Client> getAllByStatus(@PathVariable String status) {
        return clientService.findClientsByStatus(status);
    }

    @PutMapping("/update-surname/{index}/{surname}")
    public Client updateSurname(@PathVariable int index, @PathVariable String surname) {
        return clientService.updateClientSurname(index, surname);
    }

    @DeleteMapping("/delete-by-account-number/{number}")
    public String deleteByAccountNumber(@PathVariable String number) {
        clientService.deleteClientByAccountNumber(number);
        return "Client deleted successfully";
    }

    @GetMapping("/count-all-by-status/{status}")
    public int countAllByStatus(@PathVariable String status) {
        return clientService.countByStatus(status);
    }

    @GetMapping("/get-statistics")
    public List<ClientsStatistics> getStatistics() {
        return clientService.getClientsStatistics();
    }
}