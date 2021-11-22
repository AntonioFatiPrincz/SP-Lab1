package models;

import services.Visitee;
import services.Visitor;

import java.util.ArrayList;

public class Section implements Element, Visitee {
    private String name;
    private ArrayList<Element> elements=new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }
    Section (Section section){
        name = section.name;
    }

//    public void print(){
//        System.out.println(name);
//        for(Element el:elements)
//            el.print();
//    }

    @Override
    public void add(Element element) {
        // cream clona

//        if(element instanceof Paragraph){
//            Paragraph paragraphCopy = new Paragraph((Paragraph) element);
//            this.elements.add(paragraphCopy);
//        }else if(element instanceof Image) {
//            Image imageCopy = new Image((Image) element);
//            this.elements.add(imageCopy);
//        }else if(element instanceof Section){
//            Section sectionCopy = new Section((Section) element);
//            this.elements.add(sectionCopy);
//        }else {
//            Table tableCopy = new Table((Table) element);
//            this.elements.add(tableCopy);
//        }

//        for (Element el: elements){
//            System.out.println(el);
//        }


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


    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }
}
