package hello;

public class CalcolatriceBean {
    private int val1;
    private int val2;
    private double ris;

    @Override
    public String toString() {
        return "CalcolatriceBean{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", ris=" + ris +
                '}';
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public double getRis() {
        return ris;
    }

    public void setRis(double ris) {
        this.ris = ris;
    }

    public double getSomma() {
        System.out.println("sono getSomma=" + (val1 + val2));
        return ris = val1 + val2;
    }

    public double getProdotto() {
        System.out.println("sono getProdotto=" + (val1 * val2));
        return ris = val1 * val2;
    }
    public double getSottrazione() {
        System.out.println("sono getSottrazione=" +(val1 -val2));
        return ris = val1 - val2;
    }

    public double getDivisione() {
        System.out.println("sono getDivisione=" + (val1 / val2));
        return ris = val1 / val2;
    }
}
