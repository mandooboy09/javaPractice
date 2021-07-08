package c.inheritance;

public class ManageStudent {
    public static void main(String[] args){
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();

    }

    public void checkEquals(){
        Student a = new Student("Min","seoul","01012345678","java@string.com", 18);
        Student b = new Student("Min","seoul","01012345678","java@string.com", 18);

        if(a.equals(b) == true){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        System.out.println("a hashCode = " + a.hashCode());
        System.out.println("b hashCode = " + b.hashCode());


    }

}
