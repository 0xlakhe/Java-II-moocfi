import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Map<String,Integer>> storage;

    public Warehouse(){
        this.storage=new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        HashMap<String,Integer> innerMap=new HashMap<>();
        innerMap.put("price",price);
        innerMap.put("stock", stock);

        this.storage.put(product, innerMap);
    }  

    public int price(String name){
        boolean contains=this.productCheck(name);
        if(contains){
            return this.storage.get(name).get("price");
        }
        return -99;
    }

    public int stock(String product){
        boolean contains=this.productCheck(product);
        if(contains){
            return this.storage.get(product).get("stock");
        }
        return 0;
    }

    public boolean productCheck(String product){
        if(this.storage.containsKey(product)){
            return true;
        }
        return false;
    }

    public boolean take(String product){
        boolean contains=this.productCheck(product);
        if(contains){
            int stock=this.storage.get(product).get("stock");
            if(stock>0){
                this.storage.get(product).put("stock",stock-1);
                
                return true;
            }
        }  
        return false;
    }

    public Set<String> products(){
        Set<String> prods=new HashSet<>();

        for(String product:this.storage.keySet()){
            prods.add(product);
        }
        return prods;
    }
}
