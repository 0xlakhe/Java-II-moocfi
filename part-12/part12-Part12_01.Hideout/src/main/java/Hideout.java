import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hide;
    public Hideout(){
        this.hide=new ArrayList<>();
    }

    public void putIntoHideout(T toHide){
        if(this.hide.size()==1){
            this.hide.set(0, toHide);

        }else{
            this.hide.add(toHide);
        }
    }

    public T takeFromHideout(){
        T toReturn=this.hide.get(0);
        this.hide.remove(0);
        return toReturn;
    }

    public boolean isInHideout(){
        if(this.hide.size()>0){
            return true;
        }
        return false;
    }
}
