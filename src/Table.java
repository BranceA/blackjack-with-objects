import java.util.ArrayList;

public class Table {
    private static ArrayList<Player> players;
    private static Dealer dealer = new Dealer();

    private static void start(){
        players.add(new Player());
        Deck deckBeingPlayed = new Deck();

        Player onlyOnePlayerRightNow = players.get(0);

        deckBeingPlayed.dealCard(onlyOnePlayerRightNow.getHand());
        deckBeingPlayed.dealCard(onlyOnePlayerRightNow.getHand());

        deckBeingPlayed.dealCard(dealer.getHand());
        deckBeingPlayed.dealCard(dealer.getHand());
    };
    private static void evaluate(){};

    public static void main(String[] args) {
        Deck testDeck = new Deck();
        Hand testHand = new Hand();

        testHand.hit(testDeck);
        testHand.hit(testDeck);
        testHand.hit(testDeck);

        for (Card card : testHand.getCurrentHand()){
            System.out.println("card.getWhatCard() = " + card.getWhatCard());
            System.out.println("card.getPointValue() = " + card.getPointValue());
        }

        System.out.println("testHand.getPoints() = " + testHand.getPoints());
    }
}
