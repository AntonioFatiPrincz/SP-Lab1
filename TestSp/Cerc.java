public class Cerc extends FiguriDeBza{
    private int razaCerc;
    private String nume;
    private MetodaPrintare metodaPrintare;

    public Cerc(String nume, int x, int y, String culoare, int dimensiune, int razaCerc) {
        super(x, y, culoare, dimensiune);
        this.nume=nume;
        this.razaCerc = razaCerc;
    }

    public String getNume() {
        return nume;
    }

    public void setMetodaPrintare(MetodaPrintare metodaPrintare){
        this.metodaPrintare=metodaPrintare;
    }

    @Override
    public void print() {
        System.out.println("Nume :" + this.nume + " CoordX :" + this.getX() + " CoordY :" + this.getY() +
                " Culoare : " + this.getCuloare() + " Dimensiune : " + this.getDimensiune() + " Raza Cerc " + this.razaCerc);
        if (this.metodaPrintare != null){
            System.out.println("Metoda de printare folosita este : " + this.metodaPrintare);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
