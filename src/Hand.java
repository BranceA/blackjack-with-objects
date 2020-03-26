import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> currentHand;
    private int points;
    private int bet;
    private boolean isBusted;
    private boolean isNatural;

    public void hit(Deck deck){
        deck.dealCard(this);

        int newPointTotal = this.getPoints();
    };

    public Hand() {
        this.currentHand = new ArrayList<Card>();
        isBusted = false;
    }

    public ArrayList<Card> getCurrentHand() {
        return currentHand;
    }

    public void setCurrentHand(ArrayList<Card> currentHand) {
        this.currentHand = currentHand;
    }

    public int getPoints() {
        int points = 0;
        boolean emergencyAce = false;
        for (Card card : currentHand){
            points += card.getPointValue();
        }
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
