package black.state;

// 게임이 끝난 상태
// 인터페이스와 추상 클래스 사이에 연결~~~
public abstract class Finished implements State {

    @Override
    public State draw(PlayingCard card) {
        return new IllegalStateException();
    }

    // 배팅 후 수익률
    @Override
    public double profit(int money) {
        return money * rate();
    }

    abstract double rate();
}
