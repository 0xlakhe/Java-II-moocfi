package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean state;

    public TemperatureSensor(){
        this.state=false;
    }

    public void setOn(){
        this.state=true;
    }

    public void setOff(){
        this.state=false;
    }

    public boolean isOn(){
        return this.state;
    }

    public int read(){

        if(!this.state){
            throw new IllegalStateException("bye bye");
        }
        int temp=new Random().nextInt(61);
        return temp-30;
    }
}
