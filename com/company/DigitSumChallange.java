package com.company;

public class DigitSumChallange {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(2556));
        System.out.println(sumDigits(156));
        System.out.println(sumDigits(-1256));
         System.out.println(sumDigits(-1256));
    }

    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum=0;
        //125->125/10=12->12*10=120->125-120=5

        while(number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum;

    }
}
