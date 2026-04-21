import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
        this.items=new ArrayList<>();
    }
    
    public void add(Item item){
        int weight=item.getWeight();
        if((this.capacity-weight)>=0){
            this.items.add(item);
            this.capacity-=weight;
        }
    }


    public boolean isInBox(Item item){
        if(items.contains(item)){
            return true;
        }
        return false;
    }

}
