package main.methods;

import main.models.CoffeeMaker;

import static main.Demo.coffeeMakers;
import static main.Util.getMediumPower;
import static main.Util.getMediumVolume;

public class FunctionValueAnalize {

    public static CoffeeMaker functionValueAnalize1() {
        CoffeeMaker best = new CoffeeMaker();
        double mediumVolume = getMediumVolume();

        for (CoffeeMaker c : coffeeMakers) {
            if (c.volume >= mediumVolume && c.power / c.price > best.power / c.price) {
                best = c;
            }
        }
        return best;
    }

    public static CoffeeMaker functionValueAnalize2() {
        CoffeeMaker best = new CoffeeMaker();
        double mediumPower = getMediumPower();
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power >= mediumPower && c.volume / c.price > best.volume / c.price) {
                best = c;
            }
        }
        return best;
    }
}
