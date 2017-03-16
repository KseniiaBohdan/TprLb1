package main;

import main.models.CoffeeMaker;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;
import static main.methods.FunctionValueAnalize.functionValueAnalize1;
import static main.methods.FunctionValueAnalize.functionValueAnalize2;
import static main.methods.MainCriterionMethod.mainCriterion;
import static main.methods.MaxMinModelMethod.maxMinModel;
import static main.methods.MaxValueModel.maxVolueModel;
import static main.methods.OptimizePrinciple.optimize;
import static main.methods.ValueFunction.valueFunction;

public class Demo {

    public final static ArrayList<CoffeeMaker> coffeeMakers = new ArrayList<CoffeeMaker>() {
        {
            add(new CoffeeMaker("x1", 1260, 0.8, 13800));
            add(new CoffeeMaker("x2", 1300, 0.8, 4198));
            add(new CoffeeMaker("x3", 1500, 1.3, 6990));
            add(new CoffeeMaker("x4", 1000, 0.96, 8500));
            add(new CoffeeMaker("x5", 850, 0.8, 5540));
            add(new CoffeeMaker("x6", 1200, 1.5, 3651));
            add(new CoffeeMaker("x7", 800, 0.7, 17990));
            add(new CoffeeMaker("x8", 1300, 0.5, 7890));
            add(new CoffeeMaker("x9", 1000, 0.5, 12000));
            add(new CoffeeMaker("x10", 1300, 1, 8890));
        }
    };

    public static void main(String[] args) {
        System.out.println("Принцип головного критерію");
        mainCriterion();

        System.out.println("Функціонально-вартісний аналіз");
        System.out.println(functionValueAnalize1().toString());
        System.out.println(functionValueAnalize2().toString());
        System.out.println();

        System.out.println("Принцип послідовної оптимізації");
        List<CoffeeMaker> best = optimize();
        print(best);
        System.out.println();

        System.out.println("Функція корисності");
        print(valueFunction());
        System.out.println();

        System.out.println("Модель максимальної узагальненої корисності");
        print(maxVolueModel(valueFunction()));
        System.out.println();

        System.out.println("Модель максиміна");
        maxMinModel(valueFunction());
    }

}
