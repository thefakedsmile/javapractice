package ENcapsulation;

public class Player {
    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("player knocked out successfully");
            //reduce number of lives remaining for the palyer
        }
    }

    public int healthRemaininig(){
        return this.health;
    }
}

