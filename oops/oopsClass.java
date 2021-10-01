package oops;

public class oopsClass {
    public static void main(String[] args) {
        Car porshe=new Car();
        Car holden=new Car();
        System.out.println(porshe.getModel());
        porshe.setModel("porshev1");
        porshe.setColor("red");
        porshe.setDoors(4);
        porshe.setEngine("race");
        porshe.setWheels(4);
        porshe.setModel("911");


        System.out.println("model is "+porshe.getModel()+porshe.getColor()+porshe.getEngine());
    }
}
