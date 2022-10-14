package oops;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String color;
     private String doors;

    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("porshev1")||validModel.equals("porshe2")){
            this.model=model;
        }
        else {
            this.model="unknown model";
        }

    }
    public String getModel(){
        return this.model;
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
