import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture  {
    private String imageName;
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

    public void print(){
        System.out.println(imageName);
    }

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
}