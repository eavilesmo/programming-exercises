package cardSuit;

import exercises.CardSuit;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CardSuitTests {

    @Test
    void receive_clubs_and_return_clubs_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("3♣");
        String expectedResult = "clubs";
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
