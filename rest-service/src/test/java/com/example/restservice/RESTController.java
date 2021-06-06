package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTController {

    @Autowired
    private GreetingService greetingservice;
    @Autowired
    private CounterRepository counterRepository;

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
    public Counter count(@RequestParam(value = "id", defaultValue = "0") String id,
            @RequestParam(value = "content") String content, Long count) {
        if (counterRepository.existsById(id)) {
            System.out.println("This ID already exists.");
            return null;
        } else {
            StringTokenizer tokens = new StringTokenizer(content);
            System.out.println(tokens.countTokens());
            return greetingservice.count(id, content, val.addAndGet(tokens.countTokens()));
        }
    }

    // Find all entries of counter
    // @GetMapping("/find")
    // public List<Counter> find() {
    // return counterservice.findAll();
    // }
}
