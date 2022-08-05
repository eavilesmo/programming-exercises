package exercises;

public class CardSuit {

    public String checkCardSuit(String input) {
        String result = "";
        if (input.matches("[0-9]♣")) {
            result = "clubs";
            return result;
        }

        else if (input.contains("♦")) {
            result = "diamonds";
            return result;
        }

        else if (input.contains("♥")) {
            result = "hearts";
            return result;
        }

        else if (input.contains("♠")) {
            result = "spades";
            return result;
        }

        return result;
    }
}
