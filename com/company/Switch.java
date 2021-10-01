package com.company;

public class Switch {
    public static void main(String[] args) {
//        int value=2;
//        if(value==1){
//            System.out.println("value was 1");
//        }else if(value==2){
//            System.out.println("value was 2");
//        }else{
//            System.out.println("was 1or 2");
//        }

        int switchValue=3;

        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("actually it was a "+switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }


        char charValue='A';
        switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println( charValue+ "was found");
                break;
            default:
                System.out.println("could find anyone");
                break;
        }

        printDayOfTheWeek(5);

    }
    public static void printDayOfTheWeek(int day){
        //int day;
        switch(day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrsuday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
        }

    }
}
