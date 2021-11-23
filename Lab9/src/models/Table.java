package models;

import services.BookSaveVisitor;
import services.Visitee;
import services.Visitor;

public class Table implements Element, Visitee {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Table(String title) {
        this.title = title;
    }

    Table (Table table){
        title=table.title;
    }

//    public void print()
//    {
//        System.out.println(title);
//    }

    @Override
    public void add(Element element) {
        //Nu trebuie sa le implementam
    }

    @Override
    public void remove(Element element) {
        //Nu trebuie sa le implementam
    }

    @Override
    public Element get(int index) {
        return null;
        //Nu trebuie sa le implementam
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    @Override
    public void accept(BookSaveVisitor bookSaveVisitor) {
        bookSaveVisitor.visitTable(this);
    }
}