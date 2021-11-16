import java.util.List;

public class XMLParser implements Visitor{

    public XMLParser() {
    }

    @Override
    public void visit(Figuri figura) {
        List<Element> elements = figura.getElements();
        for(Element e : elements){
            e.accept(this);
        }
    }

    @Override
    public String visit(Cerc cerc) {
        return "" + cerc.getNume();
    }

    @Override
    public String visit(Patrat patrat) {
        return  "" + patrat .getNume();
    }

    @Override
    public String visit(Punct punct) {
        return "" + punct.getNume();
    }

}
