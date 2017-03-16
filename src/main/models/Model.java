package main.models;

public class Model {

    public String name;
    public double px1;
    public double px2;
    public double px3;
    public double px4;

    public Model() {
    }

    public Model(String name, double px1, double px2, double px3, double px4) {
        this.name = name;
        this.px1 = px1;
        this.px2 = px2;
        this.px3 = px3;
        this.px4 = px4;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", px1=" + px1 +
                ", px2=" + px2 +
                ", px3=" + px3 +
                ", px4=" + px4 +
                '}';
    }
}
