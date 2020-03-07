package task4;
import java.util.*;
public class Mainpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principle amount to find the simple and compound intrest");
		double principle = scanner.nextDouble();
		System.out.println("Enter the number of years to calculate the simple and compound intrest");
		double noOfYears = scanner.nextDouble();
		System.out.println("Enter the rate of intrest to calculate the simple and compound intrest");
		double rateOfInterest = scanner.nextDouble();
		System.out.println("enter the number based on your intrest to calculate the simple and compound intrest");
		System.out.println("1. Simple Intrest");
		System.out.println("2.Compound Intrest");
		System.out.println("3. Both");
		int  choice = scanner.nextInt();
		Simple s = new Simple();
		Compound c = new Compound();
		if(choice==1) {
			double ans = s.sim(principle,noOfYears,rateOfInterest);
			System.out.println(ans);
		}
		else if(choice==2) {
			double ans1 = c.comp(principle,noOfYears,rateOfInterest);
			System.out.println(ans1);
		}
		else {
			double ans2 = s.sim(principle,noOfYears,rateOfInterest);
			System.out.println(ans2);
			 double ans3 = c.comp(principle ,noOfYears, rateOfInterest);
			System.out.println(ans3);
		}
		
	}

}
