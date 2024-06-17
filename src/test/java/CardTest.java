import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CardTest {

    @Test
    @DisplayName("카드에 따라 1~11 까지의 점수로 계산한다")
    void checkCardScore() {
        Card card = new Card("Hearts", "A");
        assertThat(card.getScore()).isEqualTo(11);
    }

//    @Test
//    @DisplayName("ACE는 조건에 따라 1 또는 11로 계산한다")

}