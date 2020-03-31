public class Dealer extends Participant {

    public Dealer() {
        super();
    }

    public void playHand(Deck deckBeingPlayed){
        while(hand.getPoints() < 17){
            hand.hit(deckBeingPlayed);
        }
    };
}
