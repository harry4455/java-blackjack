package black.state;

public class Blackjack extends Finished{



    @Override
    public State stay() {
        return null;
    }

    @Override
    double rate() {
        return 1.5;
    }
}
