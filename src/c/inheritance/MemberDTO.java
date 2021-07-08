package c.inheritance;

import java.util.Objects;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public static void main(String[] args){
        MemberDTO dto = new MemberDTO("홍길동", "010-1234-5678", "hong@email.com");
        System.out.println(dto);
    }

    MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    MemberDTO(){
        this.name = "";
        this.phone = "";
        this.email = "";
    }

    @Override
    public String toString(){
        return "Name = " + this.name + " Phone = " + this.phone + " Email = " + this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
