package com.company;

public class MethodOverloading {

    public static void main(String[] args) {
        int newscore=calculateScore("vicky",500);
        System.out.println("new score is" + newscore);

        calculateScore(700);
        calculateScore();

    }
    public static int calculateScore(String playername,int score){
        System.out.println("player "+ playername + " scored "  +score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamed player scored "  +score + " points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("no player name no player scored ");
        return 0;
    }



}
