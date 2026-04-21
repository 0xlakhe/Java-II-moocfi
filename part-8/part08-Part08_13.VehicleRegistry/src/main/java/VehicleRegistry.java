import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> owner;
    public VehicleRegistry(){
        this.owner=new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner){
        if(this.owner.containsKey(licensePlate)){
            return false;
        }
        this.owner.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        return (this.owner.getOrDefault(licensePlate, null));
    }

    public boolean remove(LicensePlate licensePlate){
        if(this.owner.containsKey(licensePlate)){
            this.owner.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate plate:this.owner.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> owners=new ArrayList<>();
        for(LicensePlate plate:this.owner.keySet()){
            String o=this.owner.get(plate);
            if(owners.contains(o)){
                continue;
            }
            System.out.println(o);
            owners.add(o);
        }
    }


}
