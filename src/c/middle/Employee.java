package c.middle;

public class Employee {
    private String name;    // 이름
    private int type;       // 업무 역할
    private long salary;    // 연봉

    public Employee(String name, int type, long salary){
        setName(name);
        setType(type);
        setSalary(salary);
    }
    public Employee(String name){
        this(name, 0, 0);
    }
    public Employee(String name, int type){
        this(name, type, 0);
    }
    public Employee(String name, long salary){
        this(name, 0, salary);
    }
    public Employee(int type, long salary){
        this("", type, salary);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(int type){
        this.type = type;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }
    public long getSalary(){
        return salary;
    }
}
