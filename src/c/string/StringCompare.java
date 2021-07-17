package c.string;

public class StringCompare {
    public static void main(String[] args){
        StringCompare sample = new StringCompare();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString(){
        String text = "한글은 길이가 몇일까요?";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare(){
        String text = "Check value";
//        String text2 = "Check value";
        String text2 = new String("Check value");

        if(text == text2){
            System.out.println("text == text2 result is same.");
        }
        else{
            System.out.println("text == text2 result is different.");
        }
//        System.out.printf("text.hashcode() = %d text2.hashcode() = %d\n", text.hashCode(), text2.hashCode());

        if(text.equals("Check value")){
            System.out.println("text == text2 result is same.");
        }

        String text3 = "check value";
        if(text.equalsIgnoreCase(text3)){
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void checkCompareTo(){
        String text = "a";
        String text2 = "b";
        String text3 = "c";

        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));

    }

}
