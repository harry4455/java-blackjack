import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;
    private int currentCardIdx;


    public Deck() {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(cards);
        currentCardIdx = 0;
    }

    public Card drawCard() {

        Card card = null;

        if(cards.size() > currentCardIdx) {
            card = cards.get(currentCardIdx);
            currentCardIdx++;
        }

        return card;
    }
}
