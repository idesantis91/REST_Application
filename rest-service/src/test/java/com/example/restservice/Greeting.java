package com.example.restservice;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Greeting {

    private final String id;
    private final String content;
    private long count;

    public Greeting(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getCount() {
        return count;
    }
}
