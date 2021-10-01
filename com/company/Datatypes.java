package com.company;

public class Datatypes {

    public static void main(String[] args) {
        //32
        int myValue=1000;
        int myminValue=-2147483648;
        int mymaxValue=2147483647;
        int myTotal=(myminValue/2);
        System.out.println("myTotal" +myTotal);


        //8
        byte mybyteValue=127;
        byte myByteminValue=-127;
        byte myNewByteValue=(byte) (mybyteValue/2);
        System.out.println("mynewbytevalue" +myNewByteValue);
        //16 bit
        short myShortValue=-32767;
        short myShortValue1=32767;

        //64 bit
        long myLongValue=100L;



        System.out.println();
    }
}
