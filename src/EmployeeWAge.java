public class EmployeeWAge {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;

    public static void main(String[] args) {
        System.out.println("HEELo");

        int empHrs=0;
        int empWage=0;

        double empCheck= (int) Math.floor(Math.random()*10)%2;
        switch (empWage){
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HRS;
        System.out.println("Employee Wage : "+empWage);
    }
}
