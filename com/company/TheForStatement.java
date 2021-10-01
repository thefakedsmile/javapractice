package com.company;

public class TheForStatement {
    public static void main(String[] args) {
        //System.out.println(calculateIntrest(10000,2));
        System.out.println(isPrime(0));

        for(int i=2;i<9;i++){
            System.out.println("10000 at "+i +" % intrest rate=" + String.format("%.2f",calculateIntrest(10000,i)));
        }

        int count=0;
        for(int i=0;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("number "+i+"is a prime number");
                if(count==10){
                    System.out.println("exiting for loop");
                    break;
                }
            }
    }



    }

    public static double calculateIntrest(double amount, double intrestRate){
        return (amount*(intrestRate/100));
    }

    public static boolean isPrime(int n){
        if( n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


}
