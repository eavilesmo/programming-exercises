package findMean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.util.Arrays;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindMeanTests {

    @Test
    void receive_two_numbers_and_return_mean_test() {
        FindMean findMean = new FindMean();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        double actualResult = findMean.calculateMean(numbers);
        double expectedResult = 3.0;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

//    @ParameterizedTest
//    @CsvSource(value = {"2,3,4,5:3.5", "[1,2,2,54]:14.75"}, delimiter = ':')
//    void received_more_than_two_numbers_and_return_mean_test(int input, double expected) {
//        FindMean findMean = new FindMean();
//        double actualResult = findMean.calculateMean(input);
//        double expectedResult = expected;
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }

    @Test
    void received_more_than_two_numbers_and_return_mean_test() {
        FindMean findMean = new FindMean();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        double actualResult = findMean.calculateMean(numbers);
        double expectedResult = 3.5;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
