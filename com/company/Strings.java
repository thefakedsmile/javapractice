package com.company;

import javax.swing.plaf.DimensionUIResource;

public class Strings {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

         String myString="This is a string";
        String myString1="This is also a string";
        
        System.out.println("myString is equal to "+ myString);
        myString=myString +"  and this is more";
        System.out.println("myString is equal to "+ myString);
        myString=myString+ "\u00A9 2015";
        System.out.println("myString is equal to "+ myString);

        String numberString="250.55";
        numberString=numberString+" 49.95";
        System.out.println(numberString);

        String lastString= "10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("laststring ="+lastString);
        
        String lastString1= "10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("laststring ="+lastString);

        double DoubleNumber=120.447;
        lastString=lastString+ DoubleNumber;
        System.out.println("lastString value="+lastString);

    }
}
