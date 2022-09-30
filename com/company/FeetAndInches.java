package com.company;

public class FeetAndInches {
    public static void main(String[] args) {
        feetAndInchesToCentimeters(6,0);
        feetAndInchesToCentimeters(52);
        feetAndInchesToCentimeters(5,8);
        feetAndInchesToCentimeters(55);

    }

    public static double feetAndInchesToCentimeters(double feet,double inches){
        if((feet<0) ||((inches<0)&& (inches>12))){
            return -1;
        }
        double centimeter=(feet*12)*2.54;
        centimeter+=inches*2.54;
        System.out.println(feet+" feet "+ inches+" inches = "+ centimeter+
        " cm ");
        return centimeter;
    }
    public static double feetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;

        }
        double feet=(int)inches/12;
        double remainingInches=(int) inches % 12;
        System.out.println(inches+" inches is equal to "+feet+" feet and "+remainingInches +" inches" );
        return feetAndInchesToCentimeters(feet,remainingInches);
    }


}
