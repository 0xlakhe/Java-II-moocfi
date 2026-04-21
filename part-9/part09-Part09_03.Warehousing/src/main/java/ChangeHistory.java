import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history=new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        return Collections.max(this.history);
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        return Collections.min(this.history);
    }

    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        double sum=0;
        for(double number: this.history){
            sum+=number;
        }
        return sum/this.history.size();
    }

    public String toString(){
        return String.valueOf(this.history);
    }
}
