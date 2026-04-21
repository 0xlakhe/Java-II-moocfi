import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility(){
        this.storage=new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        ArrayList<String> items=this.storage.get(storageUnit);
        if(items.contains(item)){
            this.storage.get(storageUnit).remove(item);
        }
        if(this.storage.get(storageUnit).size()==0){
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> keys=new ArrayList<>();

        for(String key:this.storage.keySet()){
            keys.add(key);
        }
        return keys;
    }
}
