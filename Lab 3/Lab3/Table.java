package Lab3;


public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }
    public void print()
    {
        System.out.println(title);
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