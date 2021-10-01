package Composition;

public class Monitor {
    private String model;
    private String Manufacteror;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacteror, int size, Resolution nativeResolution) {
        this.model = model;
        Manufacteror = manufacteror;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y,String color){
        System.out.println(("drawing Pixel At "+x+","+y+" in color "+color));
    }

    public String getModel() {
        return model;
    }

    public String getManufacteror() {
        return Manufacteror;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
