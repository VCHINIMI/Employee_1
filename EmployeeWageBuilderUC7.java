public class EmployeeWageBuilderUC7{
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
		
	private final int EMP_RATE_PER_HOUR =20;
	private final int NUM_OF_WORKING_DAYS=2;		
	private final int MAX_HOURS_PER_MONTH=10;
		
	private int computeEmpWage() {
		int empHrs = 0;
		int tot_emp_hours =0;
		int tot_working_days =0;
		
		
	    while(tot_emp_hours<=MAX_HOURS_PER_MONTH && tot_working_days<=NUM_OF_WORKING_DAYS) {
	    	tot_working_days++;
	    	int empCheck= (int) Math.floor(Math.random() *10)%3;
	    	switch (empCheck){
				case FULL_TIME :
					empHrs=8;
					break;
				case PART_TIME :
					empHrs = 4;
					break;
				default :
					empHrs = 0;
					break;
	    	}
		    tot_emp_hours+=empHrs;
		    System.out.println("Day#: "+tot_working_days+" Emp Hr : "+empHrs);
	    }
	    return tot_emp_hours*EMP_RATE_PER_HOUR;
	}

	public static void main(String args[]){
            EmployeeWageBuilderUC7 dMart= new EmployeeWage();   
	    System.out.println("Total Emp Wage for Company DMART : "+" is " + dMart.computeEmpWage());
	}
}