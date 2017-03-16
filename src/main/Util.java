package main;

import main.models.CoffeeMaker;

import java.util.List;

import static main.Demo.coffeeMakers;

public class Util {

    public static void print(List coffeeMakers) {
        for (Object c : coffeeMakers) {
            System.out.println(c.toString() + " ");
        }
        System.out.println();
    }

    public static double getMediumVolume() {
        double mediumVolume = 0;
        for (CoffeeMaker c : coffeeMakers) {
            mediumVolume += c.volume;
        }
        mediumVolume /= 10;
        return mediumVolume;
    }

    public static double getMediumPower() {
        double mediumPower = 0;
        for (CoffeeMaker c : coffeeMakers) {
            mediumPower += c.power;
        }
        mediumPower /= 10;
        return mediumPower;
    }

    public static double getMediumPrice() {
        double mediumPrice = 0;
        for (CoffeeMaker c : coffeeMakers) {
            mediumPrice += c.price;
        }
        mediumPrice /= 10;
        return mediumPrice;
    }

    public static double getMaxPrice() {
        double maxPrice = 0;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price > maxPrice) {
                maxPrice = c.price;
            }
        }
        return maxPrice;
    }

    public static double getMinPrice() {
        double minPrice = coffeeMakers.get(0).price;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price < minPrice) {
                minPrice = c.price;
            }
        }
        return minPrice;
    }

    public static double getMaxValume() {
        double maxVolume = 0;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.volume > maxVolume) {
                maxVolume = c.volume;
            }
        }
        return maxVolume;
    }

    public static double getMinValume() {
        double minVolume = coffeeMakers.get(0).volume;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.volume < minVolume) {
                minVolume = c.volume;
            }
        }
        return minVolume;
    }

    public static double getMaxPower() {
        double maxPower = 0;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power > maxPower) {
                maxPower = c.power;
            }
        }
        return maxPower;
    }


    public static double getMinPower() {
        double minPower = coffeeMakers.get(0).power;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power < minPower) {
                minPower = c.power;
            }
        }
        return minPower;
    }
}
