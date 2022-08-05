package cardSuit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class CardSuitTests {

    @Test
    void receive_clubs_and_return_clubs_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("3♣");
        String expectedResult = "clubs";
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_diamonds_and_return_diamonds_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("3♦");
        String expectedResult = "diamonds";
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_hearts_and_return_hearts_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("3♥");
        String expectedResult = "hearts";
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_spades_and_return_spades_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("3♠");
        String expectedResult = "spades";
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void receive_any_number_with_clubs_and_return_clubs_test() {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit("5♣");
        String expectedResult = "clubs";
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @ParameterizedTest
    @CsvSource({"4♣,clubs", "1♠,spades", "5♥,hearts", "3♦, diamonds"})
    void receive_any_number_with_any_suit_and_return_appropriate_suit_test(String input, String expected) {
        CardSuit cardSuit = new CardSuit();
        String actualResult = cardSuit.checkCardSuit(input);
        String expectedResult = expected;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
