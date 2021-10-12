package Lab3;

import java.util.ArrayList;

public class Section implements Element{
    private String name;
    private ArrayList<Element> elements=new ArrayList<>();
    public Section(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
        for(Element el:elements)
            el.print();
    }

    @Override
    public void add(Element element) {
        this.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);

    }

    @Override
    public Element get(int index) {
        if(index < 0 || index >=elements.size()){
            return null;
            //alternativa aruncam exceptii

        }
        return elements.get(index);
    }


}
