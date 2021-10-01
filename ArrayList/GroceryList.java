package ArrayList;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList=new ArrayList<String >();

    //function to add a grocery item

    public void addGroceryItem(String item){
        groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("you have "+groceryList.size()+" items in your grocarylist");
        for (int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+" , "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+" has been updated");
    }

    public void removeGroceryItem(int position){
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchitem){
        //boolean exists=groceryList.contains(searchitem);
        int position=groceryList.indexOf(searchitem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}
