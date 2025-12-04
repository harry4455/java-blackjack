import java.util.List;

public abstract class Player {

    private List<Card> cardList;
    private int totalScore;


    public Player(List<Card> cardList) {
        this.cardList = cardList;
        this.totalScore = 0;
    }

    public int sumTotalScore() {

        int totalScore = 0;

        for (Card card : cardList) {
            totalScore += card.getScore();
        }

        return totalScore;
    }
}
