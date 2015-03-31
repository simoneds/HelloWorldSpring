package hello;

public class CalcolatriceBean {
    private int val1;
    private int val2;
    private double ris;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("type=" +type);
        this.type = type;
    }

    public double getRisultato () {
        if ("sommma".equals(getType())) {
            return ris = val1 + val2;
        }
        if ("differenza".equals(getType())) {
            return ris = val1 - val2;
        }
        if ("prodotto".equals(getType())) {
            return ris = val1 * val2;
        }
        if ("divisione".equals(getType())) {
            return ris = val1 / val2;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "CalcolatriceBean{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", ris=" + ris +
                ", type='" + type + '\'' +
                '}';
    }
}
