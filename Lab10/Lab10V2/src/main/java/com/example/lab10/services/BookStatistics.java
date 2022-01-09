package com.example.lab10.services;


import com.example.lab10.models.*;

import java.util.ArrayList;

public class BookStatistics implements BookSaveVisitor{
    private int numberBooks = 0;
    private int numberSections = 0;
    private int numberImages = 0;
    private int numberImageProxies = 0;
    private int numberTable = 0;
    private int numberTableOfContents = 0;
    private int numberParagraph = 0;
    @Override
    public void visitBook(Book book) {
        numberBooks++;
        ArrayList<Element> elements = book.getContent();

        for(Element e: elements){
            if (e instanceof Visitee){
                Visitee visitee = (Visitee) e;
                visitee.accept(this);
            }
        }
    }

    @Override
    public void visitSection(Section section) {
        numberSections++;
        ArrayList<Element> elements = section.getElements();

        for(Element e: elements){
            if (e instanceof Visitee){
                Visitee visitee = (Visitee) e;
                visitee.accept(this);
            }
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        numberTableOfContents++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        numberImageProxies++;
    }

    @Override
    public void visitImage(Image image) {
        numberImages++;
    }

    @Override
    public void visitTable(Table table) {
        numberTable++;
    }

    public void printStatistic(){
        System.out.println("NR BOOKS : " + numberBooks);
        System.out.println("NR SECIONS : " + numberSections);
        System.out.println("NR IMAGES : " + numberImages);
        System.out.println("NR IMAGE-PROXY : " + numberImageProxies);
        System.out.println("NR TABLE : " + numberTable);
        System.out.println("NR TABLECONTENT : " + numberTableOfContents);
        System.out.println("NR PARAGRAPH: " + numberParagraph);
    }
}
