package last_lab;

public class Cards {
    private String rank;
    private String suit;

    public Cards(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
