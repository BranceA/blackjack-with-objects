public class Player {
    private Hand hand;
    private int bankroll;

    public Player() {
        this.hand = new Hand();
        this.bankroll = 1000;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getBankroll() {
        return bankroll;
    }

    public void setBankroll(int bankroll) {
        this.bankroll = bankroll;
    }
}
