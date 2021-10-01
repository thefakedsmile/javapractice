package ReferencesVsValues;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue=10;
        int anotherIntValue=myIntValue;

        System.out.println("myIntValue= "+myIntValue);
        System.out.println("anotherIntValue= "+anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue= "+myIntValue);
        System.out.println("anotherIntValue= "+anotherIntValue);

        int[] myintArray=new int[5];
        int[] anotherArray=myintArray;

        System.out.println("myIntArray"+ Arrays.toString(myintArray));
        System.out.println("another array "+Arrays.toString(anotherArray));

        anotherArray[0]=1;

        System.out.println("myIntArray change"+ Arrays.toString(myintArray));
        System.out.println("another array change"+Arrays.toString(anotherArray));

        modifyArray(myintArray);

        System.out.println("myIntArray modify change"+ Arrays.toString(myintArray));
        System.out.println("another array modify change"+Arrays.toString(anotherArray));

        anotherArray=new int[]{4,5,6,7,8};


        System.out.println("myIntArray modify change"+ Arrays.toString(myintArray));
        System.out.println("another array modify change"+Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0]=2;
        array=new int[] {1,2,3,4,5};

    }
}
