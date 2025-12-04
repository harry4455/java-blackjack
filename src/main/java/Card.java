public class Card {

//    private final String cardNum;
//
//    public Card(String cardNum) {
//        this.cardNum = cardNum;
//    }

    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {

        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getScore() {
        return Rank.getValueByRankName(rank);
    }
}
