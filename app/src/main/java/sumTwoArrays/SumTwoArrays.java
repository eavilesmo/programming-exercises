package sumTwoArrays;

import java.util.ArrayList;

public class SumTwoArrays {
    public int addArrays(ArrayList<Integer> listOfNumbersOne, ArrayList<Integer> listOfNumbersTwo) {
        String stringResultOne = "";
        String stringResultTwo = "";
        for (int number : listOfNumbersOne) {
            String convertedNumber = Integer.toString(number);
            stringResultOne += convertedNumber;
        }
        for (int number : listOfNumbersTwo) {
            String convertedNumber = Integer.toString(number);
            stringResultTwo += convertedNumber;
        }
        int integerResult = (Integer.parseInt(stringResultOne) + Integer.parseInt(stringResultTwo));
        return integerResult;
    }
}
