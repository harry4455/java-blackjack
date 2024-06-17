import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DeckTest {

    @Test
    @DisplayName("덱에서 같은 카드가 뽑혔는지 확인한다")
    void checkSameCard() {
        Deck deck = new Deck();

        Card card = deck.drawCard();

        for(int i=0; i < 51; i++) {
            System.out.println("i = " + i);
            Card compareCard = deck.drawCard();
            assertThat(card).isNotEqualTo(compareCard);
            System.out.println("rank = " + compareCard.getRank());
            System.out.println("suit = " + compareCard.getSuit());
        }


    }
}