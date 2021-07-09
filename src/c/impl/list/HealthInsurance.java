package c.impl.list;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1),
    LEVEL_TWO(2000, 2),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);
    int maxSalary;
    double ratio;

    HealthInsurance(int maxSalary, double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio(){
        return ratio;
    }
    public int getMaxSalary(){
        return maxSalary;
    }

    public static HealthInsurance getHealthInsurance(int salary){

        if(salary <= HealthInsurance.LEVEL_ONE.getMaxSalary()) return HealthInsurance.LEVEL_ONE;
        else if(salary <= HealthInsurance.LEVEL_TWO.getMaxSalary()) return HealthInsurance.LEVEL_TWO;
        else if(salary <= HealthInsurance.LEVEL_THREE.getMaxSalary()) return HealthInsurance.LEVEL_THREE;
        else if(salary <= HealthInsurance.LEVEL_FOUR.getMaxSalary()) return HealthInsurance.LEVEL_FOUR;
        else if(salary <= HealthInsurance.LEVEL_FIVE.getMaxSalary()) return HealthInsurance.LEVEL_FIVE;
        else return HealthInsurance.LEVEL_SIX;
    }

    public static void main(String[] args){
        int[] salaryArray = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurance = new HealthInsurance[3];

        insurance[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurance[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurance[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for(int index = 0; index < 3; index++){
            System.out.println(salaryArray[index] + "=" + insurance[index] + "," + insurance[index].getRatio());
        }
    }
}
