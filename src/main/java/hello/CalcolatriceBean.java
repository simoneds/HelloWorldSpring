package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class CalcolatriceBean {

    @NotNull
    @Min(0)
    @Max(100)
    private Integer val1;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer val2;

    private Integer ris;

    @Override
    public String toString() {
        return "CalcolatriceBean{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", ris=" + ris +
                '}';
    }

    public Integer getVal1() {
        return val1;
    }

    public void setVal1(Integer val1) { this.val1 = val1; }

    public Integer getVal2() {
        return val2;
    }

    public void setVal2(Integer val2) {
        this.val2 = val2;
    }

    public Integer getRis() {
        return ris;
    }

    public void setRis(Integer ris) {
        this.ris = ris;
    }

    public Integer getSomma() {
        System.out.println("sono getSomma=" + (val1 + val2));
        return ris = val1 + val2;
    }

    public Integer getProdotto() {
        System.out.println("sono getProdotto=" + (val1 * val2));
        return ris = val1 * val2;
    }

    public Integer getSottrazione() {
        System.out.println("sono getSottrazione=" + (val1 - val2));
        return ris = val1 - val2;
    }

    public Integer getDivisione() {
        System.out.println("sono getDivisione=" + (val1 / val2));
        return ris = val1 / val2;
    }
}
