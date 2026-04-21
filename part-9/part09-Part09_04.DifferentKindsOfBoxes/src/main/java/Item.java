
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object item){
        if(this==item){
            return true;
        }
        if(!(item instanceof Item)){
            return false;
        }

        Item comparedItem=(Item) item;

        if(this.name.equals(comparedItem.name)){
            return true;
        }

        return false;
    }

    public int hashCode(){
        return name.hashCode();
    }

}
