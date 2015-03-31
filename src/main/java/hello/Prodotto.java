package hello;

/**
 * Created by Simone on 25/03/2015.
 */
public class Prodotto {

    private int fattore1;
    private int fattore2;

    public int getFattore1() {
        return fattore1;
    }

    public void setFattore1(int fattore1) {
        this.fattore1 = fattore1;
    }

    public int getFattore2() {
        return fattore2;
    }

    public void setFattore2(int fattore2) {
        this.fattore2 = fattore2;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "fattore1=" + fattore1 +
                ", fattore2=" + fattore2 +
                '}';
    }

    public int getProdotto() {
        return fattore1 * fattore2;
    }
}
