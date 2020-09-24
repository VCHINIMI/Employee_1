public class EmployeeWageBuilderUC6{
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS =2;

	public static void main(String args[]){
		//int FULL_TIME = 1;
		//int PART_TIME = 2;
		//int EMP_RATE_PER_HOUR = 20;
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage =0;
	   for(int day =0;day<NUM_OF_WORKING_DAYS; day++){

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
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage = totalEmpWage + empWage;
		System.out.println("Emp Wage : " + empWage);
	    }
	System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
