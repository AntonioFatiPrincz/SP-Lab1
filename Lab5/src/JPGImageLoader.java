public class JPGImageLoader implements ImageLoader{
    public ImageContent load(String s) {
        System.out.println("Creating JPGImage");
        return new ImageContent(s);
    }
}
