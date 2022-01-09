package com.example.lab10.services;
import com.example.lab10.models.*;

public class DocumentManager {
    private static DocumentManager instance;
    private Book book;

    private DocumentManager(){

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static DocumentManager getInstance(){
        if (instance == null){
            instance =  new DocumentManager();
        }
        return instance;
    }
}
