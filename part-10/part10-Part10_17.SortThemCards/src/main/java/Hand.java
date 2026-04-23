import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand(){
        this.cards=new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        cards.stream().forEach(p->System.out.println(p));
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    public int compareTo(Hand hand){
        int thisSum= this.cards.stream().map(p->p.getValue()).reduce(0, (previousSum,currentValue)->previousSum+currentValue);
        int compareSum= hand.cards.stream().map(p->p.getValue()).reduce(0, (previousSum,currentValue)->previousSum+currentValue);

        return thisSum-compareSum;
    }

    public void sortBySuit(){
        this.sort();
        Collections.sort(this.cards,(c1,c2)->c1.getSuit().ordinal()-c2.getSuit().ordinal());
    }
}
