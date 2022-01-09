package com.example.lab10.services;

import com.example.lab10.models.Paragraph;

import javax.naming.Context;

public interface AlignStrategy {
    void render (Paragraph p, Context c);
}
