package c.util;

public class FinalVariable {
    final int instanceVariable = 3;

    public static void main(String[] args){
        FinalVariable fv = new FinalVariable();

        System.out.println(fv.instanceVariable);
    }

    public void method(final int parameter){
        final int localVariable;
    }

}
