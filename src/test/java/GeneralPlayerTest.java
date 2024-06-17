import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GeneralPlayerTest {



    @Test
    @DisplayName("플레이어가 보유한 카드의 총합을 구한다")
    void sumAllCard() {
        List<Card> cards = List.of(
                new Card("Hearts", "Q"), new Card("Spades", "J"), new Card("Clubs", "7"));
        GeneralPlayer generalPlayer = new GeneralPlayer(cards);
       final int result = sumAll(generalPlayer);
       assertThat(result).isEqualTo(27);
    }

    @Test
    @DisplayName("플레이어가 보유한 카드의 총합이 21을 넘고 ACE가 포함되었을 때 1로 계산한다")
    void sumAllCardOver21AndContainsAce() {
        List<Card> cards = List.of(
                new Card("Hearts", "Q"), new Card("Spades", "A"), new Card("Clubs", "7"));
        GeneralPlayer generalPlayer = new GeneralPlayer(cards);
        final int result = sumAll(generalPlayer);
        assertThat(result).isEqualTo(18);
    }

    private int sumAll(GeneralPlayer generalPlayer) {
        return generalPlayer.sumTotalScore();
    }

}