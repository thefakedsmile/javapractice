package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        int count=1;
        while (count!=6){
            System.out.println("count is "+ count);
            count++;
            if(count==6) {
                break;
            }
        }
        count=6;
        do{
            System.out.println("count is"+count);
            count++;
//it will break of count will 100
            if(count>100){
                break;
            }
        }while (count!=6);



    }



}
