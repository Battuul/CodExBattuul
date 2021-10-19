package com.example.breeds.model;

import java.util.Arrays;

public class Breed {
    private String name;
    private String[] type;

    @Override
    public String toString() {
        return "Breed{" +
                "name='" + name + '\'' +
                ", type=" + Arrays.toString(type) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public Breed(String name, String[] type) {
        this.name = name;
        this.type = type;
    }
}
