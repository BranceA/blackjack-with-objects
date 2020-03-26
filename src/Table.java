public class Table {
    private static Player player = new Player();
    private static Dealer dealer = new Dealer();
    private static Input input = new Input();
    private static Deck deckBeingPlayed = new Deck();

    private static void start(){

        System.out.printf("Your bankroll is %d. How much would you like to bet?%n", player.getBankroll());
        int playerBet = input.getInt(1, player.getBankroll());
        boolean playerIsDone = false;
        player.getHand().setBet(playerBet);

        player.getHand().hit(deckBeingPlayed);
        player.getHand().hit(deckBeingPlayed);

        dealer.getHand().hit(deckBeingPlayed);
        dealer.getHand().hit(deckBeingPlayed);
        displayTable();

        while (!playerIsDone && !player.getHand().isBusted()){
            System.out.println("Would you like to hit? yes/no");
            boolean wantToHit = input.yesNo();
            if(wantToHit){
                player.getHand().hit(deckBeingPlayed);
                displayTable();
            }else {
                playerIsDone = true;
            }
        }

        System.out.println("playerIsDone = " + playerIsDone);
        System.out.println("player.getHand().isBusted() = " + player.getHand().isBusted());
        dealer.playHand(deckBeingPlayed);
        displayTable();
    };

    private static void evaluate(Hand hand){

    };

    private static void displayTable(){
        System.out.printf("Your hand: %s%nTotal Points: %d%n", player.getHand().getCurrentHandAsString(), player.getHand().getPoints());
        System.out.printf("Dealer's hand: %s%nTotal Points %d%n", dealer.getHand().getCurrentHandAsString(), dealer.getHand().getPoints());
    }

    public static void main(String[] args) {
        start();
    }
}
