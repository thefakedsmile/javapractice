package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}


class Jaws extends Movie{
    public Jaws(){
        super("jaws");
    }

    public String plot(){
        return "a shark eats lots f people";
    }
     public String plot(){
        return "a shark eats lots f people";
    }

}



class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("independence day");
    }
    @Override
    public String plot(){
        return "Aliens attempt to take our earth";
    }

}




class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("independence day");
    }
    @Override
    public String plot(){
        return "Aliens attempt to take our earth";
    }

}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("maze Runner");
    }

    @Override
    public String plot() {
        return "kids try to escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Starwars");
    }


    @Override
    public String plot() {
        return "imperial forces try to take over universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("forgetable");
    }
    //no plot method
}
class StarWars extends Movie{
    public StarWars() {
        super("Starwars");
    }

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #" +i+ " : "+movie.getName() +"\n" +
                    "plot:" +movie.plot()+"\n");
        }

    }
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*5+1);
        System.out.println("random number generated was"+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                 return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
    }
    return null;

    }
}



