package findMean;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
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
}
