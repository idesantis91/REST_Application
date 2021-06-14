package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.*;
import java.util.StringTokenizer;

@RestController
public class CountController {

    @Autowired
    private CountService countService;

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
    public ResponseEntity<?> count(@RequestParam(value = "id") String id,
            @RequestParam(value = "content") String content, Long count) {
        StringTokenizer tokens = new StringTokenizer(content);
        System.out.println(tokens.countTokens());
        return countService.count(id, content, val.addAndGet(tokens.countTokens()));
    }

    // Find all entries of counter
    // @GetMapping("/find")
    // public List<Count> find() {
    // return countService.findAll();
    // }
}
