package main.methods;

import main.models.MaxMinModel;
import main.models.ValueModel;

import java.util.ArrayList;
import java.util.List;

public class MaxMinModelMethod {

    public static void maxMinModel(List<ValueModel> models) {
        List<MaxMinModel> maxMinModels = new ArrayList<>();
        int i = 1;
        for (ValueModel m : models) {
            maxMinModels.add(new MaxMinModel("x" + i, minP(m)));
        }
        printMaxMinP(maxMinModels);
    }

    private static void printMaxMinP(List<MaxMinModel> maxMinModels) {
        double maxP = 0;
        for (MaxMinModel m : maxMinModels) {
            if (maxP < m.maxMinP) {
                maxP = m.maxMinP;
            }
        }
        for (MaxMinModel m : maxMinModels) {
            if (m.maxMinP == maxP) {
                System.out.println(m.toString());
            }
        }
    }

    private static double minP(ValueModel m) {
        double minP = m.p1;
        if (m.p2 < minP) {
            minP = m.p2;
        }
        if (m.p3 < minP) {
            minP = m.p3;
        }
        return minP;
    }
}
