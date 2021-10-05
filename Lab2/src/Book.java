

import java.util.ArrayList;

    public class Book {
        private String title;
        private ArrayList<Author> authors;
        private ArrayList<Chapter> chapters= new ArrayList<>();
        public Book(String name) {
            this.title = name;
        }


        public void print()
        {
            System.out.println(this.title);
            for(Author el:authors)
                el.print();
            for(Chapter el:chapters)
                el.print();
        }
        public void addAuthor(Author a)
        {
            if(authors==null)
                authors=new ArrayList<>();
            authors.add(a);
        }
        public int addChapter(String str)
        {
            chapters.add(new Chapter(str));
            return chapters.size()-1;
        }
        public Chapter getChapter(int i){
            return chapters.get(i);
        }

    }

