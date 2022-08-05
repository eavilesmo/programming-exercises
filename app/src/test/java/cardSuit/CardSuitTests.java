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

}
