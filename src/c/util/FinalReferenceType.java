package c.util;

import c.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args){
        FinalReferenceType frt = new FinalReferenceType();
        frt.checkDTO();
    }

    public void checkDTO(){
        System.out.println(dto);
//        dto = new MemberDTO();
        dto.name = "taeyong";
        System.out.println(dto);
    }

}
