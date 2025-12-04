import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest{

    private List<Card> cards = new ArrayList<>();
//    private Player player = new Player();


    @BeforeEach
    void setUp() {
        cards = List.of(new Card("Hearts", "Q"), new Card("Spades", "A"), new Card("Clubs", "7"));
    }

//    @Test
//    @DisplayName("플레이어가 보유한 카드의 총합을 구한다")
//    void sumAllCard() {
//       final int result = sumAll(cards);
//        assertThat(result).isEqualTo(28);
//    }

//    private int sumAll(List<Card> cards) {
//        int total = 0;
//
//        player.sumTotalScore();
//        return player.getTotalscore();
//    }

}