import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> organisms;

    public Herd(){
        this.organisms= new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable item:organisms){
            item.move(dx, dy);
        }
    }

    public String toString(){
        String to_return="";
        for(Movable item: organisms){
            to_return+="\n"+(Organism)item;
        }
        return to_return;
    }
}
