package hello;

/**
 * Created by Simone on 24/03/2015.
 */
public class Somma {
    private int add1;
    private int add2;

    public int getAdd1 () {
        return this.add1;
    }

    public void setAdd1 (int add1) {
        this.add1 = add1;
    }

    public int getAdd2 () {
        return this.add2;
    }

    public void setAdd2 (int add2) {
        this.add2 = add2;
    }

    @Override
    public String toString() {
        return "Somma{" +
                "add1=" + add1 +
                ", add2=" + add2 +
                '}';
    }
    public int getSomma () {
        return add1+add2;
    }
}
