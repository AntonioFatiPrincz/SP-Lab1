import java.util.ArrayList;

public class Book {
    private String nameB;
    public ArrayList<String> ArrayOfContent = new ArrayList<String>();
   public  Book(String name){
       nameB = name;
   }
    public void createNewParagraph (String paragraph){
        //System.out.println(paragraph);
        this.ArrayOfContent.add(paragraph);
    }

    public void createNewImage (String image){
        //System.out.println(image);
        this.ArrayOfContent.add(image);
    }

    public void createNewTable (String table){
        System.out.println(table);
        this.ArrayOfContent.add(table);
    }

    public void print(){
        System.out.println(this.ArrayOfContent);
    }
}
