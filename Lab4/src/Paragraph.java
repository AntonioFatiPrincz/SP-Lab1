public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    Paragraph(Paragraph paragraph){
        text = paragraph.text;
    }
    public void print(){
        System.out.println(text);
    }

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


}
