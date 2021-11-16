public class Main {
    public static void main(String[] args) {
        Figuri figura1 = new Figuri();
        Figuri miniFigura = new Figuri();

        Cerc cerc1 = new Cerc("Cerc1",5,6,"albastru",35,6);
        cerc1.setMetodaPrintare(new LinieIngrosata());
        Cerc cerc2 = new Cerc("Cerc2",9,2,"galben",20,4);
        cerc2.setMetodaPrintare(new LiniePunctata());
        Patrat patrat1 = new Patrat("Patrat1",7,8,"rosu",12,7);
        Punct punct1= new Punct("Punct1",8,9,"negru",2);

        miniFigura.addElement(cerc1);
        miniFigura.addElement(patrat1);
        miniFigura.addElement(punct1);
        figura1.addElement(miniFigura);
        figura1.addElement(cerc2);

        figura1.print();

    }
}
