package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.*;
import java.util.StringTokenizer;

@RestController
public class CountController {

    @Autowired
    private CountService countService;
    @Autowired
    private CountRepository counterRepository;

    // Request ID and Message
    // @GetMapping("/greeting")
    // public Greeting greeting(@RequestParam(value = "id", defaultValue = "0")
    // String id,
    // @RequestParam(value = "content") String content) {
    // Get message and return the number of words
    // StringTokenizer tokens = new StringTokenizer(content);
    // System.out.println(tokens.countTokens());
    // int messageCount = tokens.countTokens();
    // System.out.println(greetingRepository.findAll().toString());
    // counterService.addCount(messageCount);
    // System.out.println(messageCount);
    // return greetingservice.create(id, content);
    // }

    // Counter to add current message length to count field
    AtomicLong val = new AtomicLong();

    // Request ID and Message
    @GetMapping("/count")
    public Count count(@RequestParam(value = "id", defaultValue = "0") String id,
            @RequestParam(value = "content") String content, Long count) {
        if (counterRepository.existsById(id)) {
            System.out.println("This ID already exists.");
            return null;
        } else {
            StringTokenizer tokens = new StringTokenizer(content);
            System.out.println(tokens.countTokens());
            return countService.count(id, content, val.addAndGet(tokens.countTokens()));
        }
    }

    // Find all entries of counter
    // @GetMapping("/find")
    // public List<Counter> find() {
    // return counterservice.findAll();
    // }
}
