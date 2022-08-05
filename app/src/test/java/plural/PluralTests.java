package plural;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class PluralTests {
    @Test
    void receive_one_and_return_true_false() {
        Plural plural = new Plural();
        boolean actualResult = plural.checkNumber(1);
        boolean expectedResult = false;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_five_and_return_true_test() {
        Plural plural = new Plural();
        boolean actualResult = plural.checkNumber(5);
        boolean expectedResult = true;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"4,true", "1,false", "376,true","91784,true"})
    void receive_any_number_and_return_appropriate_boolean_test(int input, boolean expected) {
        Plural plural = new Plural();
        boolean actualResult = plural.checkNumber(input);
        boolean expectedResult = expected;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
