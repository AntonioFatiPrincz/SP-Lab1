package services;

import models.*;

import java.util.ArrayList;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitBook(Book book) {
        System.out.println(book.getTitle());
        ArrayList<Author> authors = book.getAuthors();
        ArrayList<Element> elements = book.getContent();
        System.out.println("Authors : ");
        for(Author el:authors)
            el.print();
        for(Element el:elements){
            if (el instanceof Visitee){
                Visitee visitee = (Visitee) el;
                visitee.accept(this);
            }else {
                System.out.println("ERROR!!!!");
            }
        }

    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.getName());
        ArrayList<Element>elements = section.getElements();
        for (Element e : elements){
            if (e instanceof Visitee){
                Visitee visitee = (Visitee) e;
                visitee.accept(this);
            }else {
                System.out.println("ERROR!!!!");
            }
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        System.out.println(tableOfContents);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        if(paragraph.getAlignStrategy() != null){
            paragraph.getAlignStrategy().render(paragraph,null);
        }else {
            System.out.println("Paragraph: " + paragraph.getText());
        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        Image img = imageProxy.loadImage();
        System.out.println(imageProxy.getUrl());
        visitImage(img);
    }

    @Override
    public void visitImage(Image image) {
        if(image.getContent() != null){
            System.out.println("name : " + image.getImageName() + " content: " + image.getContent());
        }else{
            System.out.println("name : " +image.getImageName());
        }
    }

    @Override
    public void visitTable(Table table) {
        System.out.println(table.getTitle());
    }
}
