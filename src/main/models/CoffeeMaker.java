package main.models;

public class CoffeeMaker {

    public String name;
    public double power;
    public double volume;
    public double price;

    public CoffeeMaker() {
    }

    public CoffeeMaker(String name, double power, double volume, double price) {
        this.name = name;
        this.power = power;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
