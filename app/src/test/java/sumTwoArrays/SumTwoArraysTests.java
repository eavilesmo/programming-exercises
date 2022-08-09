package sumTwoArrays;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumTwoArraysTests {

    @Test
    void receive_a_list_and_return_a_string_composed_of_the_lists_elements_test() {
        SumTwoArrays sumTwoArrays = new SumTwoArrays();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(7);
        listOfNumbers.add(1);
        listOfNumbers.add(5);
        String actualResult = sumTwoArrays.addArrays(listOfNumbers);
        String expectedResult = "2715";
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
