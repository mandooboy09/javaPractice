package c.inner;

public class InnerSample {
    public static void main(String[] args){

        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject(){
//        OuterOfInner outer = new OuterOfInner();
//        OuterOfInner.Inner inner = outer. new Inner();
        OuterOfInner.Inner inner = new OuterOfInner(). new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }


}