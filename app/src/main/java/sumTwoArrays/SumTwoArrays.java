package sumTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTwoArrays {
    public ArrayList<Integer> addArrays(ArrayList<Integer> listOfNumbersOne, ArrayList<Integer> listOfNumbersTwo) {
        String stringToIntOne = convertArrayInputIntoString(listOfNumbersOne);
        String stringToIntTwo = convertArrayInputIntoString(listOfNumbersTwo);

        if (stringToIntOne.equals("") || stringToIntTwo.equals("")) {
            ArrayList<Integer> emptyList = new ArrayList<>();
            return emptyList;
        }
        else {
            int integerResult = (Integer.parseInt(stringToIntOne) + Integer.parseInt(stringToIntTwo));
            String stringResult = String.valueOf(integerResult);
            ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(stringResult.split("")));
            ArrayList<Integer> listOfInt = new ArrayList<>();
            boolean negativeResult = false;
            for (String number : listOfStrings) {
                if (number.equals("-")){
                    negativeResult = true;
                    continue;
                }
                int convertedNumber = Integer.parseInt(number);
                listOfInt.add(convertedNumber);
            }
            if (negativeResult == true) {
                int negativeInteger = listOfInt.get(0) *(-1);
                listOfInt.set(0, negativeInteger);
            }
            return listOfInt;
        }
    }
    public String convertArrayInputIntoString(ArrayList<Integer> listOfNumbers) {
        String stringToInt = "";
        for (int number : listOfNumbers) {
            String convertedNumber = Integer.toString(number);
            stringToInt += convertedNumber;
        }
        return stringToInt;
    }
}
