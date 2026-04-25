package application;

public class StandardSensor implements Sensor{
    private int number;
    
    public StandardSensor(int number){
        this.number=number;

    }

    public int read(){
        return this.number;
    }

    public boolean isOn(){
        return true;
    }
    
    public void setOn(){

    }

    public void setOff(){

    }
}
