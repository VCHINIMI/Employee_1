public class EmployeeWageBuilderUC3{

	public static void main(String args[]){
		int FULL_TIME = 1;
		int PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		
		int empHrs = 0;
		int empWage = 0;

		double empCheck= Math.floor(Math.random() *10)%3;
		if( empCheck == PART_TIME )
			empHrs = 4;
			//System.out.println("present");
		else if (empCheck == FULL_TIME)
			empHrs = 8;
		else
			empHrs=0;
		empWage= empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}
}
