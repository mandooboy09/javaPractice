package c.inheritance;

public class Child extends Parent {
    public Child(){
        System.out.println("Constructor - Child");
    }

    public Child(String name){
        System.out.println("Constructor - Child");
    }

    public void printName(){
        System.out.println("PrintName() - Child");
    }

    public void printAge(){
        System.out.println("printAge - 18 month");
    }
}
