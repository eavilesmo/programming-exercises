package meanOfTwoMeans;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MeanOfTwoMeansTests {

    @Test
    void receive_two_numbers_and_return_the_mean_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        double actualResult = meanOfTwoMeans.getMean(2,3);
        double expectedResult = 2.5;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
