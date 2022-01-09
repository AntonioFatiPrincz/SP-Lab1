package com.example.lab10.services;

public interface Visitee {
    public void accept(Visitor visitor);
    public void accept(BookSaveVisitor bookSaveVisitor);
}
