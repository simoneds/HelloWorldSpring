package hello;

/**
 * Created by Simone on 25/03/2015.
 */
public class Operazione {
    private int val1;
    private int val2;
    private String type;

    public Operazione() {
        System.out.println("sono il costruttore");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        System.out.println("sono setType=" + type);

        this.type = type;
    }

    public int getVal1() {
        System.out.println("sono getVal1=" + val1);
        return val1;
    }

    public void setVal1(int val1) {
        System.out.println("sono setVal1=" + val1);
        this.val1 = val1;
    }

    public int getVal2() {
        System.out.println("sono getVal2=" + val2);
        return val2;
    }

    public void setVal2(int val2) {
        System.out.println("sono setVal2=" + val2);
        this.val2 = val2;
    }

    public int getSomma() {
        System.out.println("sono getSomma=" + val1 + val2);
        return val1 + val2;
    }

    public int getProdotto() {
        System.out.println("sono getProdotto=" + val1 * val2);
        return val1 * val2;
    }

    @Override
    public String toString() {
        return "Operazione{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", type='" + type + '\'' +
                '}';
    }
}

