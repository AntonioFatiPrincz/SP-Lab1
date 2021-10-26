public class ImageProxy implements Element, Picture {
    private String url;
    private Dimension dim;
    public Image realImage;

    public ImageProxy(String url) {
        this.url=url;
        this.dim= new Dimension(35,45);
    }

    @Override
    public void print() {
        Image img = loadImage();
        img.print();
    }

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
}
