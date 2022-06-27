import java.util.ArrayDeque;

public class Deque01 {

    public static void main(String[] args) {
        
        ArrayDeque<String> cards = new ArrayDeque<String>();

        cards.add("Ronaldinho");
        cards.add("Pelé");
        cards.add("Neymar");
        cards.add("Romario");

        for (String card : cards) {
            System.out.println("Figurinha: " + card);
        }

        cards.clear();

        System.out.println("Figurinhas:" + cards);

        System.out.println("Adicionando com first e last:");

        cards.addFirst("Romario");
        cards.add("Pelé");
        cards.add("Neymar");
        cards.add("Ronaldinho Gaucho");

        System.out.println(cards);    
    }
}
