package Composition2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Wall wall1=new Wall("west");
        Wall wall2=new Wall("east");
        Wall wall3=new Wall("north");
        Wall wall4=new Wall("south");


        Celling celling=new Celling(12,55);
        Bed bed=new Bed("modern",4,3,2,1);
        Lamp lamp=new Lamp("classic",false,75);
        Bedroom bedroom=new Bedroom("vicky bedroom",wall1,wall2,wall3,wall4,celling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnON();

        System.out.println(bedroom.getName());



    }
}
