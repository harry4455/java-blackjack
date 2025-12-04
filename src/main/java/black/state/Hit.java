package black.state;

public class Hit implements State {

    private final Hands hands;

    public Hit(Hands hands) {
        if(hands.size() < 2) {
            throw new IllegalArgumentException();
        }

        this.hands = hands;
    }

    @Override
    public State draw(PlayingCard card) {
        final Hands hands = this.hands.add(card);

        if(hands.score() > 21) {
            return new Bust();
        }
        return new Hit(hands);
    }

    @Override
    public State stay() {
        return new Stay();
    }
}
