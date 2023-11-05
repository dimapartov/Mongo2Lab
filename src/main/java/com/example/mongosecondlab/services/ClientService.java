package com.example.mongosecondlab.services;


import com.example.mongosecondlab.models.Client;
import com.example.mongosecondlab.models.ClientsStatistics;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients(); //done

    Client createClient(Client client); //done

    void deleteClientById(String id); //done

    List<Client> findClientsByStatus(String status); //done

    Client updateClientSurname(int index, String surname); //done

    void deleteClientByAccountNumber(String accountNumber); //done

    int countByStatus(String status); //done


    List<ClientsStatistics> getClientsStatistics();
}