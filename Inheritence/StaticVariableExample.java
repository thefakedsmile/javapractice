package Inheritence;

class Dog1{
    private static String name;
    public Dog1(String name){
        Dog1.name=name;
    }

    public void printName(){
        System.out.println("name= "+name);
    }
}




public class StaticVariableExample {
    public static void main(String[] args) {
        Dog1 rex=new Dog1("rex");
        Dog1 labradore=new Dog1("fluffy");
        rex.printName();//printing fluffy instead of rex because of static variable name
        //if we change a static variable then its value will be updated all over the class
        labradore.printName();
    }

}
