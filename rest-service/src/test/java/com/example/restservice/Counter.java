package com.example.restservice;

public class Counter {

    private String id;

    public long count;

    public Counter(String id, long count) {
        this.id = id;
        this.count = count;
    }

    // Getters

    public String getId() {
        return id;
    }

    public long getCount() {
        return count;
    }

}
