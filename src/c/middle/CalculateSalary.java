package c.middle;

public class CalculateSalary {

    public static void main(String[] args){
        CalculateSalary calculator = new CalculateSalary();
        calculator.calculateSalaries();
    }
    public long getSalayIncrease(Employee employee){
        int increaseRate = 0;
        if(employee.getType() == 1 )
            increaseRate = 5;
        else if(employee.getType() == 2)
            increaseRate = 110;
        else if(employee.getType() == 3)
            increaseRate = 120;
        else if(employee.getType() == 4)
            increaseRate = 130;
        else if(employee.getType() == 5)
            increaseRate = 200;

        long salary = employee.getSalary() * increaseRate / 100;

        return salary;
    }
    public void calculateSalaries(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employees[1] = new Employee("KimManager", 2, 100000000);
        employees[2] = new Employee("WhangDesign", 3, 70000000);
        employees[3] = new Employee("ParkArchi", 4, 80000000);
        employees[4] = new Employee("LeeDevelop", 5, 60000000);

        for(int i = 0; i < 5; i++){
            String name = employees[i].getName();
            long salary = getSalayIncrease(employees[i]);
            System.out.println(name + "=" + salary);
        }
    }

}
