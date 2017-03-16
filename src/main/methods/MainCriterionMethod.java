package main.methods;

import main.models.CoffeeMaker;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;
import static main.Demo.coffeeMakers;
import static main.Util.getMediumPower;
import static main.Util.getMediumPrice;
import static main.Util.getMediumVolume;

public class MainCriterionMethod {

    public static void mainCriterion() {
        double mediumPower = getMediumPower();
        double mediumPrice = getMediumPrice();
        double mediumVolume = getMediumVolume();
        List<CoffeeMaker> result = new ArrayList<>();

        //power
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price < mediumPrice && c.volume > mediumVolume) {
                result.add(c);
            }
        }
        System.out.println("by power");
        print(getBestPower(result));
        result.clear();

        //valume
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price < mediumPrice && c.power > mediumPower) {
                result.add(c);
            }
        }
        System.out.println("by valume");
        print(getBestVolume(result));
        result.clear();

        //price
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power > mediumPower && c.volume > mediumVolume) {
                result.add(c);
            }
        }
        System.out.println("by price");
        print(getBestPrice(result));
        result.clear();
    }

    private static List<CoffeeMaker> getBestPower(List<CoffeeMaker> coffeeMakers) {
        List<CoffeeMaker> result = new ArrayList<>();
        double maxPower = 0;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power > maxPower) {
                maxPower = c.power;
            }
        }
        for (CoffeeMaker c : coffeeMakers) {
            if (c.power == maxPower) {
                result.add(c);
            }
        }
        return result;
    }

    private static List<CoffeeMaker> getBestVolume(List<CoffeeMaker> coffeeMakers) {
        List<CoffeeMaker> result = new ArrayList<>();
        double maxVolume = 0;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.volume > maxVolume) {
                maxVolume = c.volume;
            }
        }
        for (CoffeeMaker c : coffeeMakers) {
            if (c.volume == maxVolume) {
                result.add(c);
            }
        }
        return result;
    }

    private static List<CoffeeMaker> getBestPrice(List<CoffeeMaker> coffeeMakers) {
        List<CoffeeMaker> result = new ArrayList<>();
        double minPrice = coffeeMakers.get(0).price;
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price < minPrice) {
                minPrice = c.price;
            }
        }
        for (CoffeeMaker c : coffeeMakers) {
            if (c.price == minPrice) {
                result.add(c);
            }
        }
        return result;
    }

}
