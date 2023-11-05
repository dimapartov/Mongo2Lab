package com.example.mongosecondlab.services.impl;


import com.example.mongosecondlab.models.Client;
import com.example.mongosecondlab.models.ClientsStatistics;
import com.example.mongosecondlab.repos.ClientRepository;
import com.example.mongosecondlab.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(Client client) {
        clientRepository.save(client);
        return clientRepository.findByIndex(client.getIndex());
    }

    @Override
    public void deleteClientById(String id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> findClientsByStatus(String status) {
        return clientRepository.findAllByStatusIgnoreCase(status);
    }

    @Override
    public Client updateClientSurname(int index, String surname) {
        Client client = clientRepository.findByIndex(index);
        client.setSurname(surname);
        clientRepository.save(client);
        return clientRepository.findByIndex(client.getIndex());
    }

    @Override
    public void deleteClientByAccountNumber(String accountNumber) {
        Client client = clientRepository.findClientByAccountNumber(accountNumber);
        clientRepository.delete(client);
    }

    @Override
    public int countByStatus(String status) {
        return clientRepository.countByStatusIgnoreCase(status);
    }

    @Override
    public List<ClientsStatistics> getClientsStatistics() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.unwind("accounts"),
                Aggregation.unwind("accounts.cards"),
                Aggregation.group("status")
                        .avg("accounts.cards.balance").as("averageBalance")
        );

        AggregationResults<ClientsStatistics> results = mongoTemplate.aggregate(aggregation, "clients", ClientsStatistics.class);

        return results.getMappedResults();
    }
}