package c.inheritance;

public class Cat extends Animal {
    public static String KIND = "Cat";
    Cat(String name, int iq, int legCount){
        super(name, KIND, iq, legCount);

    }

    // 짖기
    public void bark(){
        System.out.println("Cat - bark()");
    }

    @Override
    public void move(){
        System.out.println("Cat - move");
    }

    @Override
    public void eatFood(){
        super.satiety += 1;
        System.out.println("Cat - eatFood");
    }

    @Override
    public void sleep(){
        System.out.println("Cat - sleep()");
    }
}