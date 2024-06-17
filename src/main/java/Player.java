import java.util.List;
import java.util.function.Predicate;

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

        long aceCount =  cardList.stream()
                .filter(card -> card.getRank().contains("A"))
                .count();

        if(aceCount > 0 && totalScore > 21) {
            totalScore -= 10;
        }
        return totalScore;
    }
}
