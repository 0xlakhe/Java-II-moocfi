import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<>();
    }

    public void add(String product, int price){
        Item products=new Item(product,1,price);
        if(!this.items.contains(products)){
            this.items.add(new Item(product, 1, price));
        }else{
            for(Item item:this.items){
                if(item.getProduct().equals(product)){
                    item.increaseQuantity();
                }
            }
        }
    }

    public int price(){
        int price=0;
        if(this.items.size()==0){
            return price;
        }
        for(Item item:this.items){
            price+=item.price();
        }
        return price;
    }

    public void print(){
        for(Item item: items){
            System.out.println(item);
        }
    }

}
