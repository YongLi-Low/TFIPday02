package src.day02_task;

public class Main {
    
    public static void main(String[] args) {
        Deck deck_out = new Deck();
        System.out.println(deck_out);

        deck_out.shuffle();
        System.out.printf(">> after shuffle: %s\n", deck_out);

    }
}
