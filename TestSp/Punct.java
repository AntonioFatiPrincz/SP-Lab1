public class Punct extends FiguriDeBza{
    private String nume;
    public Punct(String nume,int x, int y, String culoare, int dimensiune) {
        super(x, y, culoare, dimensiune);
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void print() {
        System.out.println("Nume :" + this.nume + " CoordX :" + this.getX() + " CoordY :" + this.getY() +
                " Culoare : " + this.getCuloare() + " Dimensiune : " + this.getDimensiune() );
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

