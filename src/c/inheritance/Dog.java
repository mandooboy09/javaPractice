package c.inheritance;

public class Dog extends Animal {
    public static String KIND = "Dog";
    Dog(String name, int iq, int legCount){
        super(name, KIND, iq, legCount);

    }

    // 짖기
    public void bark(){
        System.out.println("Dog - bark()");
    }

    @Override
    public void move(){
        System.out.println("Dog - move");
    }

    @Override
    public void eatFood(){
        super.satiety += 1;
        System.out.println("Dog - eatFood");
    }

    @Override
    public void sleep(){
        System.out.println("Dog - sleep()");
    }
}