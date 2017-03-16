package main.methods;

import main.models.Model;
import main.models.ValueModel;

import java.util.ArrayList;
import java.util.List;

public class MaxValueModel {

    public static List<Model> maxVolueModel(List<ValueModel> param) {
        List<Model> result = new ArrayList<>();

        double a11 = 0.33333;
        double a12 = 0.33333;
        double a13 = 0.33333;

        double a21 = 0.3;
        double a22 = 0.5;
        double a23 = 0.2;

        double a31 = 0.6;
        double a32 = 0.2;
        double a33 = 0.2;

        double a41 = 0.2;
        double a42 = 0.1;
        double a43 = 0.7;

        int i = 1;
        for (ValueModel c : param) {
            double px1 = a11 * c.p1 + a12 * c.p2 + a13 * c.p3;
            double px2 = a21 * c.p1 + a22 * c.p2 + a23 * c.p3;
            double px3 = a31 * c.p1 + a32 * c.p2 + a33 * c.p3;
            double px4 = a41 * c.p1 + a42 * c.p2 + a43 * c.p3;
            result.add(new Model("x" + i, px1, px2, px3, px4));
            i++;
        }

        printMaxP(result);
        return result;
    }

    private static void printMaxP(List<Model> models) {
        double maxP1 = 0;
        double maxP2 = 0;
        double maxP3 = 0;
        double maxP4 = 0;
        for (Model m : models) {
            if (maxP1 < m.px1) {
                maxP1 = m.px1;
            }
            if (maxP2 < m.px2) {
                maxP2 = m.px2;
            }
            if (maxP3 < m.px3) {
                maxP3 = m.px3;
            }
            if (maxP4 < m.px4) {
                maxP4 = m.px4;
            }
        }
        System.out.println("Max P1 = " + maxP1 + " " + "Max P2 = " + maxP2 + " " + "Max P3 = " + maxP3 + " " + "Max P4 = " + maxP4);
    }
}
