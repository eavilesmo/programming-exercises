package meanOfTwoMeans;

import java.util.ArrayList;

public class MeanOfTwoMeans {
    public double getMean(ArrayList<Double> input, int xFirstElements, int yLastElements) {
        double result = 0;
        if (xFirstElements <= 1) {
            return result = -1;
        }
        else {
            double resultMeanXFirstElements = getMeanXFirstElements(input, xFirstElements);
            double resultMeanYLastElements = getMeanYLastElements(input, yLastElements);
            result = (resultMeanXFirstElements + resultMeanYLastElements) / 2;
            return result;
        }
    }

    public double getMeanXFirstElements(ArrayList<Double> input, int xFirstElements) {
        double resultMeanXFirstElements = 0;
        int count = 0;
        for (int index = 0; index < xFirstElements; index++) {
            resultMeanXFirstElements += input.get(index);
            count ++;
        }
        resultMeanXFirstElements /= count;
        return resultMeanXFirstElements;
    }

    public double getMeanYLastElements(ArrayList<Double> input, int yLastElements) {
        double resultMeanYLastElements = 0;
        int count = 0;
        for (int index = ((input.size()-yLastElements)); index < input.size(); index++) {
            resultMeanYLastElements += input.get(index);
            count ++;
        }
        resultMeanYLastElements /= count;
        return resultMeanYLastElements;
    }
}
