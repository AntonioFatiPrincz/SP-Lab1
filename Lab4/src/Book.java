import java.util.ArrayList;

class Book {
    private String title;
    private ArrayList<Author> authors;
    private ArrayList<Element> content= new ArrayList<>();
    public Book(String name) {
        this.title = name;
    }


    public void print()
    {
        System.out.println(this.title);
        for(Author el:authors)
            el.print();
        for(Element el:content)
            el.print();
    }
    public void addAuthor(Author a)
    {
        if(authors==null)
            authors=new ArrayList<>();
        authors.add(a);
    }

    public void addContent(Element element){

        this.content.add(element);
    }



}
