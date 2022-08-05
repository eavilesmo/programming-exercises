package exercises;

public class CardSuit {

    public String checkCardSuit(String input) {
        String result = "";
        if (input == "3♣") {
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

        return result;
    }
}
