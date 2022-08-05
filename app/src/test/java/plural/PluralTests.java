package plural;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class PluralTests {
    @Test
    void receive_one_and_return_true_test() {
        Plural plural = new Plural();
        boolean actualResult = plural.checkNumber(1);
        boolean expectedResult = true;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
