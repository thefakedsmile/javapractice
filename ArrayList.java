import java.util.Scanner;

public class ArrayList {
    private static Scanner s=new Scanner(System.in);
    private static int[] baseData=new int[10];

    public static void main(String[] args) {
        System.out.println("enter 20 int");
        getInput();
        PrintArray(baseData);
        resizeArray();

    }
    
    public static void main(String[] args) {
        System.out.println("enter 200 int");
        getInput();
        PrintArray(baseData);
        resizeArray();

    }
    
    

    private static void getInput(){
        for(int i=0;i<baseData.length;i++){
            baseData[i]=s.nextInt();
        }
    }

    private static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++);
    }

    private static void resizeArray(){
        int[] original=baseData;
    }
}
