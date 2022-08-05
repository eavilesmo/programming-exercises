package findMean;

import java.util.ArrayList;

public class FindMean {

    public double calculateMean(ArrayList<Integer> inputNumbers) {
        double result = 0;
        int count = 0;
        for (int number: inputNumbers) {
            result += number;
            count += 1;
            result /= count;
        }
        return result;
    }
}
