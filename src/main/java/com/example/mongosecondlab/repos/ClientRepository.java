package com.example.mongosecondlab.repos;


import com.example.mongosecondlab.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

    Client findByIndex(int index);

    List<Client> findAllByStatusIgnoreCase(String status);

    int countByStatusIgnoreCase(String status);

    @Query("{'accounts.number': ?0}")
    Client findClientByAccountNumber(String accountNumber);

}