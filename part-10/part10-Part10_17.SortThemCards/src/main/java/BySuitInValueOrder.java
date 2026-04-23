import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    
    public int compare(Card c1, Card c2) {
    // compare suits first
    int suit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
    if(suit < 0) {
        return -1;
    } else if(suit > 0) {
        return 1;
    }
    
    // suits are equal, compare by value
    int value = c1.getValue() - c2.getValue();
    if(value < 0) {
        return -1;
    } else if(value > 0) {
        return 1;
    }
    
    return 0;  // completely equal
}
}
