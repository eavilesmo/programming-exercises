package sumTwoArrays;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumTwoArraysTests {

//    @Test
//    void receive_a_list_and_return_a_string_composed_of_the_lists_elements_test() {
//        SumTwoArrays sumTwoArrays = new SumTwoArrays();
//        ArrayList<Integer> listOfNumbers = new ArrayList<>();
//        listOfNumbers.add(2);
//        listOfNumbers.add(7);
//        listOfNumbers.add(1);
//        listOfNumbers.add(5);
//        String actualResult = sumTwoArrays.addArrays(listOfNumbers);
//        String expectedResult = "2715";
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }

//    @Test
//    void receive_a_list_and_return_a_number_composed_of_the_lists_elements_test() {
//        SumTwoArrays sumTwoArrays = new SumTwoArrays();
//        ArrayList<Integer> listOfNumbers = new ArrayList<>();
//        listOfNumbers.add(2);
//        listOfNumbers.add(7);
//        listOfNumbers.add(1);
//        listOfNumbers.add(5);
//        int actualResult = sumTwoArrays.addArrays(listOfNumbers);
//        int expectedResult = 2715;
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }

    @Test
    void receive_two_lists_and_return_the_sum_of_the_two_test() {
        SumTwoArrays sumTwoArrays = new SumTwoArrays();
        ArrayList<Integer> listOfNumbersOne = createList(2,7,1,5);
        ArrayList<Integer> listOfNumbersTwo = createList(6,1,3,1);
        int actualResult = sumTwoArrays.addArrays(listOfNumbersOne, listOfNumbersTwo);
        int expectedResult = 8846;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    public ArrayList<Integer> createList(int num1, int num2, int num3, int num4) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(num1);
        listOfNumbers.add(num2);
        listOfNumbers.add(num3);
        listOfNumbers.add(num4);
        return listOfNumbers;
    }

}
