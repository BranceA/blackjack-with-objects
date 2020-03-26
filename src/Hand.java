import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> currentHand;
    private int points;
    private int bet;
    private boolean isBusted;
    private boolean isNatural;

    public void hit(){};

    public ArrayList<Card> getCurrentHand() {
        return currentHand;
    }

    public void setCurrentHand(ArrayList<Card> currentHand) {
        this.currentHand = currentHand;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public boolean isBusted() {
        return isBusted;
    }

    public void setBusted(boolean busted) {
        isBusted = busted;
    }

    public boolean isNatural() {
        return isNatural;
    }

    public void setNatural(boolean natural) {
        isNatural = natural;
    }
}
