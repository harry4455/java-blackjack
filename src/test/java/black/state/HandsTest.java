package black.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class HandsTest {

    @Test
    @DisplayName("KING, QUEEN, JACK은 10점이다.")
    void jack() {
        var hands = new Hands(List.of(CLUBS_ACE));
        var actual = hands.score();
        Assertions.assertThat(actual).isEqualTo(0);

    }

    @Test
    @DisplayName("TWO와 KING이 있으면 12점이다.")
    void score() {
        var hands = new Hands(List.of(CLUBS_TWO, CLUBS_KING));
        var actual = hands.score();
        Assertions.assertThat(actual).isEqualTo(12);
    }

    @Test
    @DisplayName("ACE와 KING이 있으면 21점이다.")
    void aceKing() {
        var hands = new Hands(List.of(CLUBS_ACE, CLUBS_KING));
        var actual = hands.score();
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    @DisplayName("ACE와 TEN, KING이 있으면 21점이다.")
    void aceTenKing() {
        var hands = new Hands(List.of(CLUBS_ACE, CLUBS_KING, CLUBS_KING));
        var actual = hands.score();
        Assertions.assertThat(actual).isEqualTo(0);
    }
}