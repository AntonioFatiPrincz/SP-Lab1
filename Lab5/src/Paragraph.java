import javax.naming.Context;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    Paragraph(Paragraph paragraph){
        text = paragraph.text;
    }
    public void print(){
        if(alignStrategy != null){
            alignStrategy.render(this,null);
        }else {
            System.out.println("Paragraph: " + text);
        }
        //System.out.println(text);
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

    public String getName(){
        return  this.text;
    }

    public void setAlign(AlignStrategy align){
        this.alignStrategy = align;
    }
}
