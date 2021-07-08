package c.inheritance;

public class ToString {
    public static void main(String[] args){
        ToString thisObject = new ToString();
        thisObject.toStringMethod();
    }

    public void toStringMethod(){
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus " + this);
    }

    @Override
    public String toString(){
        return "ToString Class";
    }

}
