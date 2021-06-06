package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.StringTokenizer;

@Service
public class GreetingService {

    // @Autowired
    // private GreetingRepository greetingRepository;
    @Autowired
    private CounterRepository counterRepository;

    // Create Operation
    // public Greeting create(String id, String content) {
    // if (greetingRepository.existsById(id)) {
    // System.out.println("This ID already exists.");
    // return null;
    // } else {
    // StringTokenizer tokens = new StringTokenizer(content);
    // System.out.println(tokens.countTokens());
    // int messageCount = tokens.countTokens();
    // greetingRepository.save(new Greeting(id, content));
    // Counter last = counterRepository.findFirstByOrderByIdDesc();
    // long lastNum = last.count;
    // Counter next = new Counter(lastNum + messageCount);
    // counterRepository.save(next);
    // return greetingRepository.save(new Greeting(id, content));
    // }

    // }

    // Count Operation
    public Counter count(String id, String content, long count) {
        if (counterRepository.existsById(id)) {
            System.out.println("This ID already exists.");
            return null;
        } else {
            return counterRepository.save(new Counter(id, count));
        }

    }
    // Gets list of messages
    // public void messages() {
    // List<Greeting> messages = greetingRepository.findAll(Sort.by("message"));
    // String[] myArray = new String[messages.size()];
    // messages.toArray(myArray);
    // System.out.println(myArray);
    // }

    // Find Operation
    // public List<Counter> findAll() {
    // List<Counter> message = new ArrayList<>();
    // counterRepository.findAll().forEach(message::add);
    // return message;
    // }
}
