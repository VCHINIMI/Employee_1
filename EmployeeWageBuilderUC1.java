public class EmployeeWageBuilderUC1{

	public static void main(String args[]){
		int FULL_TIME = 1;
		
		double empCheck= Math.floor(Math.random() *10)%2;
		if( empCheck == FULL_TIME )
			System.out.println("present");
		else
			System.out.println("absent");
	}
}
