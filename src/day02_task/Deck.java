package src.day02_task;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {

    //Creating constants in java, see the "Constants" class.

    private List<Card> deck;

    // Creating a deck
    public Deck() {
        this.deck = new LinkedList<>();
        for (int i = 0; i < Constants.SUITS.length; i++){
            String suit = Constants.SUITS[i];
            for (int j = 0; j < Constants.RANKS.length; j++) {
                String rank = Constants.RANKS[j];
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }

        System.out.println("The new deck");
        System.out.println(deck);
    }
        public void shuffle() {

            //create a random number
            Random rand = new SecureRandom();

            for (int curr = 0; curr < deck.size(); curr++) {
                int toSwap = rand.nextInt(deck.size());  // will generate between 0 to 51
                Card c = deck.get(curr);
                Card d = deck.get(toSwap);
                deck.set(curr, d);
                deck.set(toSwap, c);
            }
        }

        

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }



    // ArrayList<Card> cards = new ArrayList<Card>();

    // String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    // String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

    // public Deck() {

    //     // Add cards into the deck
    //     for (int i = 0; i < suit.length; i++){
    //         for (int j = 0; j < rank.length; j++) {
    //             this.cards.add(new Card(suit[i], rank[j]));
    //         }
    //     }

    //     // Shuffle cards once it is formed
    //     Collections.shuffle(this.cards);
    // }

    // public ArrayList<Card> getDeck() {
    //     return cards;
    // }

    // public static void main(String[] args) {
        
    //     Deck deck_out = new Deck();

    //     System.out.println(deck_out.getDeck());
    // }


}
