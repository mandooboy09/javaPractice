package c.inheritance;

public class Animal {
    protected String name;
    protected String kind;
    protected int iq;
    protected int legCount;
    protected int satiety; // 포만감

    Animal(String name, String kind, int iq, int legCount){
        this.name = name;
        this.kind = kind;
        this.iq = iq;
        this.legCount = legCount;
        this.satiety = 50;
    }
    // 이동
    public void move(){
        System.out.println("Animal - move()");
    }
    //음식 먹기
    public void eatFood(){
        this.satiety += 1;
        System.out.println("Animal - eatFood()");
    }
    // 잠자기
    public void sleep(){
        System.out.println("Animal - sleep()");
    }
}
