public class Patrat extends FiguriDeBza{
    private int lungimeLatura;
    private String nume;
    public Patrat(String nume,int x, int y, String culoare, int dimensiune, int lungimeLatura) {
        super(x, y, culoare, dimensiune);
        this.nume = nume;
        this.lungimeLatura = lungimeLatura;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void print() {
        System.out.println("Nume :" + this.nume + " CoordX :" + this.getX() + " CoordY :" + this.getY() +
                " Culoare : " + this.getCuloare() + " Dimensiune : " + this.getDimensiune() + " Lungime latura : " + this.lungimeLatura);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

