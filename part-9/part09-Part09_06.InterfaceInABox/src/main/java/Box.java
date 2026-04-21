import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity){
        this.capacity=capacity;
        this.items=new ArrayList<>();
    }

    public double weight(){
        double heavy=0;
        
        if(this.items.size()==0){
            return heavy;
        }
        for(Packable item:this.items){
            heavy+=item.weight();
        }
        return heavy;
    }

    public void add(Packable item){
        double weig=item.weight();
        if((this.weight()+weig)<=this.capacity){
            this.items.add(item);
        }
    }

    public String toString(){
        return "Box: "+ this.items.size()+" items,"+" total weight "+this.weight()+" kg";
    }

}
