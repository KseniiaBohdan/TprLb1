package main.methods;

import main.models.CoffeeMaker;

import java.util.ArrayList;
import java.util.List;

import static main.Demo.coffeeMakers;
import static main.Util.getMediumPower;
import static main.Util.getMediumVolume;

public class OptimizePrinciple {

    public static List<CoffeeMaker> optimize() {
        List<CoffeeMaker> best = new ArrayList<>();
        best.addAll(coffeeMakers);
        //by max power
        List<CoffeeMaker> forDelete = new ArrayList<>();
        double mediumPower = getMediumPower();
        for (CoffeeMaker c : best) {
            if (c.power < mediumPower) {
                forDelete.add(c);
            }
        }
        best.removeAll(forDelete);
        forDelete.clear();

        //by max valume
        double mediumVolume = getMediumVolume();
        for (CoffeeMaker c : best) {
            if (c.volume < mediumVolume) {
                forDelete.add(c);
            }
        }
        best.removeAll(forDelete);
        forDelete.clear();

        //by max price
        for (int i = 1; i < best.size(); i++) {
            if (best.get(i).price > best.get(i - 1).price) {
                forDelete.add(best.get(i));
            }
        }
        best.removeAll(forDelete);
        forDelete.clear();
        return best;
    }

}
