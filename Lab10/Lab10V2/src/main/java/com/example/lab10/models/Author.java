package com.example.lab10.models;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    Author (Author author){
        name = author.name;
    }
    public void print()
    {
        System.out.println(name);
    }
}
