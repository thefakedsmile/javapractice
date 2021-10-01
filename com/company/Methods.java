package com.company;

public class Methods {
    public static void main(String[] args) {

//        boolean gameover=true;
//        int score=800;
//        int levelCompleted=5;
//        int bonus=100;
//        //        calculateScore(true,800,8,100);
//        //        calculateScore(true,10000,8,200);
//        int highscore=calculateScore(gameover,score,levelCompleted,bonus);
//        System.out.println("your final score was" + highscore);
//
//       gameover=true;
//       score=1000;
//       levelCompleted=8;
//       bonus=100;
//       highscore=calculateScore(gameover,score,levelCompleted,bonus);
//       System.out.println("your final score was" + highscore);
//    }
//
//    public static int calculateScore(boolean gameover,int score,int levelCompleted,int bonus){
//        if(gameover){
//            int finalScore=score+(levelCompleted*bonus);
//            finalScore=finalScore+2000;
//            //System.out.println("your final score was"+finalScore);
//            return finalScore;
//        }
//            return -1;
//        }


        int Position=calculateHighScorePosition(1500);
        DisplayHighScorePosition("tim",Position);

        Position=calculateHighScorePosition(100);
        DisplayHighScorePosition("vicky",Position);


    }

        public static void DisplayHighScorePosition(String playerName,int Position){
            System.out.println(playerName+" managed to get into position " +Position+" on the highScore table");
        }


        public static int calculateHighScorePosition(int score){
        if(score>1000){
            return 1;
        }else if(score>500 && score<1000){
            return 2;
        }else if(score>100 && score<500){
            return 3;
        }else {
            return 4;
        }

        }

    }












