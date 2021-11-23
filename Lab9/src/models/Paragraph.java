package models;

import services.AlignStrategy;
import services.BookSaveVisitor;
import services.Visitee;
import services.Visitor;

public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    Paragraph(Paragraph paragraph){
        text = paragraph.text;
    }
//    public void print(){
//        if(alignStrategy != null){
//            alignStrategy.render(this,null);
//        }else {
//            System.out.println("Paragraph: " + text);
//        }
//        //System.out.println(text);
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

    public String getName(){
        return  this.text;
    }

    public void setAlign(AlignStrategy align){
        this.alignStrategy = align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    @Override
    public void accept(BookSaveVisitor bookSaveVisitor) {
        bookSaveVisitor.visitParagraph(this);
    }
}
