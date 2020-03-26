public class Card {
    private int pointValue;
    private boolean isAce;
    private String whatCard;

    public Card(int pointValue, boolean isAce, String whatCard) {
        this.pointValue = pointValue;
        this.isAce = isAce;
        this.whatCard = whatCard;
    }

    public Card() {};

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public boolean isAce() {
        return isAce;
    }

    public void setAce(boolean ace) {
        isAce = ace;
    }

    public String getWhatCard() {
        return whatCard;
    }

    public void setWhatCard(String whatCard) {
        this.whatCard = whatCard;
    }
}
