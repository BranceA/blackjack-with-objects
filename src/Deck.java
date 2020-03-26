import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Deck() {
        this.shuffle();
    }

    public void shuffle(){
        String[] suits = {"S", "C", "D", "H"};
        ArrayList<Card> deck = new ArrayList<>();

        for(String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                String suitAndCard = "";
                suitAndCard = suit + " ";
                switch (i) {
                    case 1:
                        suitAndCard += "A";
                        deck.add(new Card(11, true, suitAndCard));
                        break;
                    case 2:
                        suitAndCard += "2";
                        deck.add(new Card(2, false, suitAndCard));
                        break;
                    case 3:
                        suitAndCard += "3";
                        deck.add(new Card(3, false, suitAndCard));
                        break;
                    case 4:
                        suitAndCard += "4";
                        deck.add(new Card(4, false, suitAndCard));
                        break;
                    case 5:
                        suitAndCard += "5";
                        deck.add(new Card(5, false, suitAndCard));
                        break;
                    case 6:
                        suitAndCard += "6";
                        deck.add(new Card(6, false, suitAndCard));
                        break;
                    case 7:
                        suitAndCard += "7";
                        deck.add(new Card(7, false, suitAndCard));
                        break;
                    case 8:
                        suitAndCard += "8";
                        deck.add(new Card(8, false, suitAndCard));
                        break;
                    case 9:
                        suitAndCard += "9";
                        deck.add(new Card(9, false, suitAndCard));
                        break;
                    case 10:
                        suitAndCard += "10";
                        deck.add(new Card(10, false, suitAndCard));
                        break;
                    case 11:
                        suitAndCard += "J";
                        deck.add(new Card(10, false, suitAndCard));
                        break;
                    case 12:
                        suitAndCard += "Q";
                        deck.add(new Card(10, false, suitAndCard));
                        break;
                    case 13:
                        suitAndCard += "K";
                        deck.add(new Card(10, false, suitAndCard));
                        break;
                }
            }
        }
        this.cards = deck;
    };

    public void dealCard(Hand receivingHand){
        Card cardToDeal;
        if(cards.size() > 0) {
            int numberInDeck = cards.size() - 1;
            int randomIndex = (int) (Math.random() * numberInDeck);
            cardToDeal = cards.get(randomIndex);
            cards.remove(randomIndex);
        }else {
            this.shuffle();
            int numberInDeck = cards.size() - 1;
            int randomIndex = (int) (Math.random() * numberInDeck);
            cardToDeal = cards.get(randomIndex);
            cards.remove(randomIndex);
        }
        receivingHand.getCurrentHand().add(cardToDeal);
    };
}
