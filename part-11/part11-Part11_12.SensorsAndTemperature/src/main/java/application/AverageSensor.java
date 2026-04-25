package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> temp;
    public AverageSensor(){
        this.sensors=new ArrayList<>();
        this.temp=new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public void setOn(){
        for(Sensor i:this.sensors){
            i.setOn();
        }
    }

    public void setOff(){
        for(Sensor i:this.sensors){
            i.setOff();
        }
    }

    public int read(){
        if(!this.isOn()){
            throw new IllegalStateException("Offoff");
        }
        int temps=0;
        for(Sensor i:this.sensors){
            int adds=i.read();
            temps+=adds;
        }   
        int average= temps/this.sensors.size();
        this.temp.add(average);
        return average;
    }

    public boolean isOn(){
        for(Sensor i:this.sensors){
            if(!i.isOn()){
                return false;
            }  
        }
        return true;
    }

    public List<Integer> readings(){
        return this.temp;
    }
}
