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
        if(newPointTotal > 21){
            isBusted = checkIfBusted();
        }
    };

    public boolean checkHandForAces(){
        boolean foundAnAce = false;
        for(Card cardToCheck : this.currentHand){
            if (cardToCheck.isAce()) {
                foundAnAce = true;
                break;
            }
        }
        return foundAnAce;
    }

    public boolean checkIfBusted(){
        boolean didHandJustBust = true;
        if(checkHandForAces()){
            for(Card cardToCheck : this.currentHand){
                if(cardToCheck.isAce()){
                    cardToCheck.setPointValue(1);
                    cardToCheck.setAce(false);
                    didHandJustBust = false;
                    break;
                }
            }
        }

        if(this.getPoints() > 21){
            didHandJustBust = true;
        }

        return didHandJustBust;
    }

    public Hand() {
        this.currentHand = new ArrayList<Card>();
        this.isBusted = false;
        this.isNatural = false;
    }

    public ArrayList<Card> getCurrentHand() {
        return currentHand;
    }

    public void setCurrentHand(ArrayList<Card> currentHand) {
        this.currentHand = currentHand;
    }

    public String getCurrentHandAsString(){
        String output = "";
        for(Card thisCard : this.currentHand){
            output += thisCard.getWhatCard();
            output += " ";
        }
        return output;
    }

    public int getPoints() {
        int points = 0;
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
