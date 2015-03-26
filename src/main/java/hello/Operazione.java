package hello;

/**
 * Created by Simone on 25/03/2015.
 */
public class Operazione {
    private int val1;
    private int val2;

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

    public int getSomma (){
        return val1+val2;
    }
    public int getProdotto (){
        return val1*val2;
    }

    @Override
    public String toString() {
        return "Operazione{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}

