package sumTwoArrays;

import java.util.ArrayList;

public class SumTwoArrays {
    public int addArrays(ArrayList<Integer> listOfNumbers) {
        String stringResult = "";
        for (int number : listOfNumbers) {
            String convertedNumber = Integer.toString(number);
            stringResult += convertedNumber;
        }
        int integerResult = Integer.parseInt(stringResult);
        return integerResult;
    }
}
