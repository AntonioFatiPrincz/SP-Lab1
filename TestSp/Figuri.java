import java.util.ArrayList;
import java.util.List;

public class Figuri implements Element {
    private int nrFiguri;
    private List<Element> elements;

    public Figuri() {
        this.nrFiguri = 0;
        this.elements = new ArrayList<Element>();
    }

    public void addElement(Element element){
        nrFiguri++;
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Structura complexa de figuri curenta are : " + this.nrFiguri + " de elemente/alte figuri");
        for (Element e : elements){
            e.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Element> getElements() {
        return elements;
    }
}
