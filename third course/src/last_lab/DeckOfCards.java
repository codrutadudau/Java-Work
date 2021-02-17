package last_lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DeckOfCards {
    ArrayList<Cards> card = new ArrayList<Cards>();

    String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};

    public DeckOfCards() {
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                this.card.add(new Cards(rank[i], suit[j]));
            }
        }
        Collections.shuffle(this.card);
    }

    public ArrayList<Cards> getDeck() {
        return card;
    }
}
