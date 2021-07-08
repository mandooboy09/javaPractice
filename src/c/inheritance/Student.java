package c.inheritance;

import java.util.Objects;

public class Student {
    String name;
    String address;
    String phone;
    String email;
    int age;

    Student(String name, String address, String phone, String email, int age){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        return Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email)
                && (age == student.age);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, address, phone, email, age);
    }
}
