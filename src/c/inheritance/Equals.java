package c.inheritance;

import c.model.MemberDTO;

public class Equals {
    public static void main(String[] args){
        Equals thisObjects = new Equals();
//        thisObjects.equalMethod();
        thisObjects.equalMethod2();
    }

    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Taeyong","","");
        MemberDTO obj2 = new MemberDTO("Taeyong","","");
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same");
        }
        else{
            System.out.println("obj1 and obj2 is different");
        }
    }

    public void equalMethod2(){
        MemberDTO obj1 = new MemberDTO("Taeyong","","");
        MemberDTO obj2 = new MemberDTO("Taeyong","","");
        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same");
        }
        else{
            System.out.println("obj1 and obj2 is different");
        }
    }

}
