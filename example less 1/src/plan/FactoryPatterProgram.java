package plan;

import java.util.Scanner;

public class FactoryPatterProgram {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		NetflixPlanFactory planFactory = new  NetflixPlanFactory(); 
		System.out.println("Enter your subscription plan : \nBasic \nStandard \nPrimium");
		String user_choice = sc.next();
		
		System.out.println("Enter for how many month you want  to subscribe the plan : ");
		int n = sc.nextInt();
		
		NetflixPlan plan = planFactory.getPlan(user_choice);{
			
			if (n >= 1 && n <=12) {
			
				System.out.println("monthly bill for your pla is :" + plan.getPrice() );
				System.out.println("Overall bill amount for the plan:");
				System.out.println(plan.getFinalAmount(n));
			
				
			}
			else {
				System.out.println("you have enter wrong no of input in month . you have to choos between 1 to 12 :");
			}
			
		}
	}

}
