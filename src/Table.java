import java.util.ArrayList;

public class Table {
    private static Player player = new Player();
    private static Dealer dealer = new Dealer();
    private static Input input = new Input();
    private static Deck deckBeingPlayed = new Deck();

    private static void start(){

        if(player.getHand().getCurrentHand().size() > 0){
            int currentBankroll = player.getBankroll();
            player = new Player(currentBankroll);
            dealer = new Dealer();
        }

        System.out.printf("Your bankroll is %d. How much would you like to bet?%n", player.getBankroll());
        int playerBet = input.getInt(1, player.getBankroll());
        boolean playerIsDone = false;
        player.getHand().setBet(playerBet);

        player.getHand().hit(deckBeingPlayed);
        player.getHand().hit(deckBeingPlayed);
        if(player.getHand().getPoints() == 21){
            playerIsDone = true;
            player.getHand().setNatural(true);
        }

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

        if(!player.getHand().isBusted()){
            dealer.playHand(deckBeingPlayed);
        }
        displayTable();
        evaluate(player, dealer);
    };

    private static void evaluate(Player player, Dealer dealer){
        if(player.getHand().isNatural()){
            int newTotal = player.getBankroll() + (int) Math.round(player.getHand().getBet() * 1.5);
            player.setBankroll(newTotal);
            System.out.printf("Oh snap! Natural 21. Your new total is %d%n", newTotal);
        }else if(player.getHand().isBusted() || (player.getHand().getPoints() < dealer.getHand().getPoints() && !dealer.getHand().isBusted())){
            int newTotal = player.getBankroll() - player.getHand().getBet();
            player.setBankroll(newTotal);
            System.out.printf("You lose. Your new total is %d%n", newTotal);
        }else if(player.getHand().getPoints() > dealer.getHand().getPoints() || dealer.getHand().isBusted()){
            int newTotal = player.getHand().getBet() + player.getBankroll();
            player.setBankroll(newTotal);
            System.out.printf("YOU WIN!!! Your new total is %d%n", newTotal);
        }else if(player.getHand().getPoints() == dealer.getHand().getPoints()){
            System.out.printf("It's a push. Your total is still %d%n", player.getBankroll());
        }

        System.out.println("Would you like to play again?");
        boolean playAgain = input.yesNo();
        if(player.getBankroll() == 0){
            System.out.println("Sorry bud. You're broke. Better luck next time.");
        }else if(playAgain){
            start();
        }
    };

    private static void displayTable(){
        System.out.printf("Your hand: %s%nTotal Points: %d%n", player.getHand().getCurrentHandAsString(), player.getHand().getPoints());
        System.out.printf("Dealer's hand: %s%nTotal Points %d%n", dealer.getHand().getCurrentHandAsString(), dealer.getHand().getPoints());
    }

    public static void main(String[] args) {
        start();
    }
}
