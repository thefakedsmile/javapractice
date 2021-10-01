package Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup(){
        theCase.PressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,500,"yellow");
    }


}
