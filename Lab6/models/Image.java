package models;

import services.ImageLoader;
import services.ImageLoaderFactory;
import services.Visitee;
import services.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    private String imageName;

    public String getImageName() {
        return imageName;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public ImageLoaderFactory getFactory() {
        return factory;
    }

    public void setFactory(ImageLoaderFactory factory) {
        this.factory = factory;
    }

    public ImageContent getContent() {
        return content;
    }



    private Dimension dim;
    private ImageLoaderFactory factory = new ImageLoaderFactory();
    private ImageContent content;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dim= new Dimension(1,2);
    }
    Image (Image image){
        imageName = image.imageName;
    }

//    public void print(){
//        System.out.println(imageName);
//    }

    public void setContent (String type){
        ImageLoader loader = factory.create(type);
        content = loader.load("DummyContent");
    }
    @Override
    public void add(Element element) {
        //Nu trebuie sa le implementam
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
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
    public String url() {
        return imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}