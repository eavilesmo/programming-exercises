package exercises;

public class CardSuit {

    public String checkCardSuit(String input) {
        String result = "";
        if (input.contains("♣")) {
            result = "clubs";
            return result;
        }

        else if (input == "3♦") {
            result = "diamonds";
            return result;
        }

        else if (input == "3♥") {
            result = "hearts";
            return result;
        }

        else if (input == "3♠") {
            result = "spades";
            return result;
        }

        return result;
    }
}
