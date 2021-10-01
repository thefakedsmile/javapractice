package ENcapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player=new Player();
//        player.playerName="vicky";
//        player.health=20;
//        player.weapon="sword";
//
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("remaing health  = "+player.healthRemaininig());
//
//        damage=11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("remaing health  = "+player.healthRemaininig());
    EnhancedPlayer player= new EnhancedPlayer("vicky",50,"sword");
        System.out.println("initial health is "+player.getHealth());
    }
}
