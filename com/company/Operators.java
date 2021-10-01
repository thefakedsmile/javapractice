package com.company;

public class Operators {
    public static void main(String[] args) {
        int result=1+2;
        System.out.println(result);


        boolean isAlien=false;
        if(isAlien=true)
            System.out.println("it is not an alien");

        int topScore=80;
        if(topScore<80)
            System.out.println("you got high score");

        int secondTopScore=81;
        if((topScore>secondTopScore) &&(topScore<100))
            System.out.println("greater than second top score and less than 100");

        if((topScore>90) || (secondTopScore<=90))
            System.out.println("one of these tests is true");

        int newValue=50;
        if(newValue==50)
            System.out.println("this is true");

        boolean isCar=false;
        if(isCar==true)
            System.out.println("this is not supposed to happen");

        boolean wasCar =isCar ?true:false;
        if(wasCar)
            System.out.println("wascar is true");





    }
}
