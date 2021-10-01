package Composition;

public class MotherBoard {
    private String model;
    private String manufactor;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufactor, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactor = manufactor;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadprogram(String programName){
        System.out.println("program "+programName+" loading....");

    }




    public String getModel() {
        return model;
    }

    public String getManufactor() {
        return manufactor;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
