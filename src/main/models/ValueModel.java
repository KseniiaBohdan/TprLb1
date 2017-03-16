package main.models;

public class ValueModel {

    public String name;
    public double p1;
    public double p2;
    public double p3;

    public ValueModel(String name, double p1, double p2, double p3) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public ValueModel() {
    }

    @Override
    public String toString() {
        return "ValueModel{" +
                "name='" + name + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
