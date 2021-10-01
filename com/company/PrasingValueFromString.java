package com.company;

public class PrasingValueFromString {

    public static void main(String[] args) {
        String numberAsString="2018.12";
        System.out.println("numberAsString " + numberAsString);
        double number=Double.parseDouble(numberAsString);
        System.out.println(number);

        numberAsString+=1;
        number+=1;

        System.out.println(number);
        System.out.println(numberAsString);
    }
}
