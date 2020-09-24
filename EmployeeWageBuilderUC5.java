public class EmployeeWageBuilderUC5{
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 2;
		public static final int MAX_HRS_IN_MONTH = 10;

	public static void main(String args[]){
		//int FULL_TIME = 1;
		//int PART_TIME = 2;
		//int EMP_RATE_PER_HOUR = 20;
		
		int empHrs = 0; int totalEmpHours= 0; int totalWorkingDays=0;
		//int empWage = 0;

	while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS){
 		totalWorkingDays++;
		int empCheck= (int) Math.floor(Math.random() *10)%3;
		switch (empCheck){
			case PART_TIME :
				empHrs = 4;
				break;
			case FULL_TIME :
				empHrs=8;
				break;
			default :
				empHrs = 0;
		}
	totalEmpHrs += empHrs;
	System.out.println("Day : "+totalWorkingDays+ "Emp Hr: "+empHrs);
	}
	int totalEmpWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println("Total Emp Wage : " + totalEmpWage);
	}
}

