package EncapsulationChallange;

public class Printer {
    private int tonnerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {
        if(tonnerLevel > -1  && tonnerLevel<=1000){
            this.tonnerLevel = tonnerLevel;
        }else {
            this.tonnerLevel=-1;
        }

        this.duplex = duplex;
        this.pagesPrinted=0;

    }
    public int addTonner(int tonnerAmount){
        if(tonnerLevel >0 && tonnerLevel<=100)
        {
            if(this.tonnerLevel+tonnerAmount>100){
                return -1;
            }
            this.tonnerLevel+=tonnerAmount;
            return this.tonnerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
