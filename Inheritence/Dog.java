package Inheritence;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String Coat;
    private String nose;

//    public Dog(int name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        Coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("dog eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk called");
        super.move(5);
    }

    private void moveLegs(int speed){
        System.out.println("Dog move legs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }

    public void run(){
        System.out.println("dog.run called");
        move(10);
    }


}
