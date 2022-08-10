package sumTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTwoArrays {
    public ArrayList<Integer> addArrays(ArrayList<Integer> listOfNumbersOne, ArrayList<Integer> listOfNumbersTwo) {
        String stringToIntOne = "";
        String stringToIntTwo = "";
        for (int number : listOfNumbersOne) {
            String convertedNumber = Integer.toString(number);
            stringToIntOne += convertedNumber;
        }
        for (int number : listOfNumbersTwo) {
            String convertedNumber = Integer.toString(number);
            stringToIntTwo += convertedNumber;
        }

        if (stringToIntOne.equals("") || stringToIntTwo.equals("")) {
            ArrayList<Integer> newList = new ArrayList<>();
            return newList;
        }
        else {
            int integerResult = (Integer.parseInt(stringToIntOne) + Integer.parseInt(stringToIntTwo));
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
}
