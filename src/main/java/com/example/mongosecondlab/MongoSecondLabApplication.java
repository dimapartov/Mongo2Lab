package com.example.mongosecondlab;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoSecondLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoSecondLabApplication.class, args);
    }

}