package EncapsulationChallange;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer(50,false);
        System.out.println("initial page count ="+printer.getPagesPrinted());
        int pagesPrinted= printer.printPages(4);
        System.out.println("pages printed was"+pagesPrinted+"my total print count for printer= "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("pages printed was "+pagesPrinted+" my total print count for printer pages= "+printer.getPagesPrinted());
        System.out.println("pages printed was "+pagesPrinted+" my total print count for printer= "+printer.getPagesPrinted());
         System.out.println("pages printed was "+pagesPrinted+" my total print count for printer= "+printer.getPagesPrinted());

    }
}

