package com.example.mongosecondlab.util;


import com.example.mongosecondlab.models.Account;
import com.example.mongosecondlab.models.Card;
import com.example.mongosecondlab.models.Client;
import com.example.mongosecondlab.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private ClientService clientService;


    @Override
    public void run(String... args) {
        seedData();
    }


    private void seedData() {

//----------------------------------------------------------------------------------------------------------------------
//Read

//        System.out.println(clientService.getAllClients());
//        System.out.println(clientService.findClientsByStatus("premium"));
//        System.out.println(clientService.countByStatus("premium"));

//----------------------------------------------------------------------------------------------------------------------
//Creation

//        Client client1 = new Client("Test", "Testov", "Testovich", "Premium", new Account[]{
//                new Account("123123123123123", "active",
//                        new Card[]{new Card("1234 5678 9012 3456", 500.00)}),
//                new Account("4356364564564564566456", "active",
//                        new Card[]{new Card("1234 5678 9012 3457", 500.00)}),
//                },10000);
//        Client createdClient = clientService.createClient(client1);
//        System.out.println(createdClient);

//----------------------------------------------------------------------------------------------------------------------
//Delete

//        clientService.deleteClientById("65481ad9bcd3c00564c17b82");
//        clientService.deleteClientByAccountNumber("7614");

//----------------------------------------------------------------------------------------------------------------------
//Update

//        System.out.println(clientService.updateClientSurname(1, "AAAAAAA"));

//----------------------------------------------------------------------------------------------------------------------
//Aggregation

//        clientService.getClientsStatistics().forEach(System.out::println);

    }
}