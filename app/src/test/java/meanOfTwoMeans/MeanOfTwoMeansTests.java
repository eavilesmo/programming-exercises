package meanOfTwoMeans;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MeanOfTwoMeansTests {
//    @Test
//    void receive_list_of_numbers_and_return_the_mean_test() {
//        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
//        ArrayList<Double> listOfNumbers = createList();
//        double actualResult = meanOfTwoMeans.getMean(listOfNumbers);
//        double expectedResult = 6.0;
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }

    @Test
    void receive_list_of_numbers_and_two_indices_and_return_mean_between_the_first_n_elements_and_last_n_elements_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        ArrayList<Double> listOfNumbers = createList();
        double actualResult = meanOfTwoMeans.getMean(listOfNumbers, 2, 3);
        double expectedResult = 5.75;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_list_of_numbers_and_x_index_is_1_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        ArrayList<Double> listOfNumbers = createList();
        double actualResult = meanOfTwoMeans.getMean(listOfNumbers, 1, 3);
        double expectedResult = -1.0;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_list_of_numbers_and_y_index_is_1_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        ArrayList<Double> listOfNumbers = createList();
        double actualResult = meanOfTwoMeans.getMean(listOfNumbers, 3, 1);
        double expectedResult = -1.0;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_list_of_numbers_and_x_index_is_higher_than_list_size_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        ArrayList<Double> listOfNumbers = createList();
        double actualResult = meanOfTwoMeans.getMean(listOfNumbers, 6, 3);
        double expectedResult = -1.0;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_list_of_numbers_and_y_index_is_higher_than_list_size_test() {
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();
        ArrayList<Double> listOfNumbers = createList();
        double actualResult = meanOfTwoMeans.getMean(listOfNumbers, 3, 9);
        double expectedResult = -1.0;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    public ArrayList<Double> createList() {
        ArrayList<Double> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2.0);
        listOfNumbers.add(7.0);
        listOfNumbers.add(10.0);
        listOfNumbers.add(5.0);
        listOfNumbers.add(6.0);
        return listOfNumbers;
    }
}
