package sumTwoArrays;

import java.util.ArrayList;

public class SumTwoArrays {
    public String addArrays(ArrayList<Integer> listOfNumbers) {
        String stringResult = "";
        for (int number : listOfNumbers) {
            String convertedNumber = Integer.toString(number);
            stringResult += convertedNumber;
        }
        return stringResult;
    }
}
