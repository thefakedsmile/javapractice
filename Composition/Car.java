package Composition;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;
    private int windows;
    

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
