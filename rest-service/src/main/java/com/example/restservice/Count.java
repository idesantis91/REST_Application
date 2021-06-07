package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Count {

    @JsonIgnore
    private String id;
    public long count;

    public Count(String id, long count) {
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
