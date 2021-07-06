package c.inheritance;

public class ChildCasting extends ParentCasting {
    public ChildCasting(){
        System.out.println("Constructor - ChildCasting");
    }

    public ChildCasting(String name){
        System.out.println("Constructor - ChildCasting");
    }

    public void printName(){
        System.out.println("PrintName() - ChildCasting");
    }

    public void printAge(){
        System.out.println("printAge - 18 month");
    }

}
