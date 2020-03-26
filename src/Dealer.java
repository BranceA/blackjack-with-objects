public class Dealer {
    private Hand hand;

    public Dealer() {
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void playHand(Deck deckBeingPlayed){
        if(hand.getPoints() < 17){
            hand.hit(deckBeingPlayed);
        }
    };
}
