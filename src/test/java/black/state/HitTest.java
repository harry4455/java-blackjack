package black.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HitTest {

    @Test
    void hit() {

        assertDoesNotThrow(() -> new Hit(new Hands(CLUBS_TWO, CLUBS_TEN)));
    }

    @Test
    void hitWithException() {
        org.assertj.core.api.Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> new Hit(new Hands(CLUBS_TWO)));
    }

    @Test
    void hitToHit() {
        var state = new Hit(new Hands(CLUBS_TWO, CLUBS_THREE));
        var actual = state.draw(CLUBS_FOUR);
        assertInstanceOf(Hit.class, actual);
    }

    @Test
    void hitToBust() {
        var state = new Hit(new Hands(CLUBS_KING, CLUBS_TEN));
        var actual = state.draw(CLUBS_FOUR);
        assertInstanceOf(Bust.class, actual);
    }

    @Test
    void hitToStay() {
        var state = new Hit(new Hands(CLUBS_KING, CLUBS_TEN));
        var actual = state.stay();
        assertInstanceOf(Stay.class, actual);
    }
}
