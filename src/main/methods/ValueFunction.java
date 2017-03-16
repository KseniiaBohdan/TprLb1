package main.methods;

import main.models.CoffeeMaker;
import main.models.ValueModel;

import java.util.ArrayList;
import java.util.List;

import static main.Demo.coffeeMakers;
import static main.Util.*;

public class ValueFunction {

    public static List<ValueModel> valueFunction() {
        List<ValueModel> result = new ArrayList<>();
        int i = 1;

        for (CoffeeMaker c : coffeeMakers) {
            double p1 = (c.power - getMinPower()) / (getMaxPower() - getMinPower());
            double p2 = (c.volume - getMinValume()) / (getMaxValume() - getMinValume());
            double p3 = (c.price - getMaxPrice()) / (getMinPrice() - getMaxPrice());
            result.add(new ValueModel("x" + i, p1, p2, p3));
            i++;
        }

        return result;
    }

}
