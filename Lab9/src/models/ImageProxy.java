package models;

import services.BookSaveVisitor;
import services.Visitee;
import services.Visitor;

public class ImageProxy implements Element, Picture, Visitee {
    private String url;
    private Dimension dim;
    public Image realImage;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public Image getRealImage() {
        return realImage;
    }

    public void setRealImage(Image realImage) {
        this.realImage = realImage;
    }

    public ImageProxy(String url) {
        this.url=url;
        this.dim= new Dimension(35,45);
    }

//    public void print() {
//        Image img = loadImage();
//        img.print();
//    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }


    public Image loadImage(){
        if (realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    @Override
    public void accept(BookSaveVisitor bookSaveVisitor) {
        bookSaveVisitor.visitImageProxy(this);
    }
}
