public class Player extends Participant {
    private int bankroll;

    public Player() {
        super();
        this.bankroll = 1000;
    }

    public Player(int bankroll){
        super();
        this.bankroll = bankroll;
    }

    public int getBankroll() {
        return bankroll;
    }

    public void setBankroll(int bankroll) {
        this.bankroll = bankroll;
    }
}
