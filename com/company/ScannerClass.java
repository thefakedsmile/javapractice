package com.company;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        Scanner vicky=new Scanner(System.in);
//
//        System.out.println("enter name");
//        String name=vicky.nextLine();
//        vicky.close();
//        System.out.println(name);

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        String name=scanner.nextLine();
        System.out.println("enter year of birth");
        int year=scanner.nextInt();
        System.out.println("your name is " + name +" and your year of birth is "+ year);
        scanner.close();
    }
}
