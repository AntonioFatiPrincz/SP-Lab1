public abstract class FiguriDeBza implements Element {
    private int x;
    private int y;
    private String culoare;
    private int dimensiune;

    public FiguriDeBza(int x, int y, String culoare, int dimensiune) {
        this.x = x;
        this.y = y;
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getDimensiune() {
        return dimensiune;
    }
}
