package com.company;

public class VariablePractice {

    public static void main(String[] args) {
        byte byteValue=10;
        short ShortValue=20;
        int intValue=50;


        long longTotal=50000L +10L *(byteValue + ShortValue +intValue);
        System.out.println("longtotal =" +longTotal );

        short shortTotal=(short) (1000+10*(byteValue+ShortValue+intValue));
        System.out.println("ShortTotal = "+shortTotal);
    }
}
