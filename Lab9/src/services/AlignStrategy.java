package services;

import models.Paragraph;

import javax.naming.Context;

public interface AlignStrategy {
    void render (Paragraph p, Context c);
}
