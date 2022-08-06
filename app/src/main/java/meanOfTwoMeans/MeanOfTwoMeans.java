package meanOfTwoMeans;

import java.util.ArrayList;

public class MeanOfTwoMeans {
    public double getMean(ArrayList<Double> input) {
        double result = 0;
        int count = 0;
        for (double number : input) {
            result += number;
            count ++;
        }
        result /= count;
        return result;
    }
}
