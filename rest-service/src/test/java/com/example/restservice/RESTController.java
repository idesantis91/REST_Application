package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RESTController {

    @Autowired
    private GreetingService greetingservice;

    // Request ID and Message
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "id", defaultValue = "0") String id,
            @RequestParam(value = "content") String content) {
        // Get message and return the number of words
        return greetingservice.create(id, content);
    }

    @GetMapping("/find")
    public List<Greeting> find() {
        return greetingservice.findAll();
    }
}
