package c.util;

import c.model.MemberDTO;

public class FinalVariable {
    final int instanceVariable;
    final MemberDTO member;

    public static void main(String[] args){
        FinalVariable fv = new FinalVariable();

        System.out.println(fv.instanceVariable);
        System.out.println(fv.member);
    }

    FinalVariable(){
        instanceVariable = 3;
        member = new MemberDTO("가재","붕어","게");
    }

    public void method(final int parameter){
        final int localVariable;
    }

}
