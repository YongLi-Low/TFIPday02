package src.day02_task;

public class Card {
    
    // Card have the property suit and rank
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    @Override
    public String toString(){
        return "\n" + rank + " of " + suit;
    }

}
