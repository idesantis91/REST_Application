package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CountService {

    // @Autowired
    // private GreetingRepository greetingRepository;
    @Autowired
    private CountRepository countRepository;

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
    public ResponseEntity<?> count(String id, String content, long count) {
        if (countRepository.existsById(id)) {
            System.out.println("This ID already exists.");
            return new ResponseEntity<String>("This ID already exists", HttpStatus.CONFLICT);
        } else {
            return new ResponseEntity<Count>(countRepository.save(new Count(id, count)), HttpStatus.ACCEPTED);
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
