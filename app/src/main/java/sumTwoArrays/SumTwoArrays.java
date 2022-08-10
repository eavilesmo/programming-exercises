package sumTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTwoArrays {
    public ArrayList<Integer> addArrays(int[] listOfNumbersOne, int[] listOfNumbersTwo) {
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
        String finalResult = String.valueOf(integerResult);
        ArrayList<String> finalList = new ArrayList<>(Arrays.asList(finalResult.split("")));
        ArrayList<Integer> newList = new ArrayList<>();
        for (String number : finalList) {
            int convertedNumber = Integer.parseInt(number);
            newList.add(convertedNumber);
        }
        return newList;
    }
}
