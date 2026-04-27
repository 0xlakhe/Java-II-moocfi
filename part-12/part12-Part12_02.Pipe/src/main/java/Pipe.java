import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe(){
        this.pipe=new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        
        if(this.pipe.size()==0){
            return null;
        }

        T toReturn=this.pipe.get(0);
        this.pipe.remove(0);

        return toReturn;
    }

    public boolean isInPipe(){
        if(this.pipe.size()>0){
            return true;
        }
        return false;
    }
}
