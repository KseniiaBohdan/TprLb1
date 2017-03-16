package main.models;

public class MaxMinModel {

    public String name;
    public double maxMinP;

    public MaxMinModel() {
    }

    public MaxMinModel(String name, double maxMinP) {
        this.name = name;
        this.maxMinP = maxMinP;
    }

    @Override
    public String toString() {
        return "MaxMinModel{" +
                "name='" + name + '\'' +
                ", maxMinP=" + maxMinP +
                '}';
    }
}
