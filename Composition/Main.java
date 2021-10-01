package Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("2208","dell","240",dimensions);
        Monitor monitor=new Monitor("27 inch","Lg",27,new Resolution(2540,1440));
        MotherBoard motherBoard=new MotherBoard("alienware","Asus",5,4,"v.244");
        PC thePC=new PC(theCase,monitor,motherBoard);


        thePC.powerup();



    }
}
