package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Create Operation
    public Greeting create(String id, String content) {
        if (greetingRepository.existsById(id)) {
            System.out.println("This ID already exists.");
            return null;
        } else {
            // System.out.println(greetingRepository.findAll().toString());
            return greetingRepository.save(new Greeting(id, content));
        }

    }

    // Find Operation
    public List<Greeting> findAll() {
        List<Greeting> message = new ArrayList<>();
        greetingRepository.findAll().forEach(message::add);
        return message;
    }
}
