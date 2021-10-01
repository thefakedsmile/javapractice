package Inheritence;

public class Main {
    public static void main(String[] args) {

        Animal animal=new Animal("animal",1,1,5,5);
        //creating an instance of a class
//        animal.eat();//calling instance of a class
//        animal.move();
        Dog dog=new Dog("Yorkie",8,20,2,4,1,32,"silky");
        dog.eat();
        //dog.walk();
        dog.run();


    }
}
