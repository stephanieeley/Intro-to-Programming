import java.util.*;

//Stephanie Eley 01/15/2020

class Excercise4_23 {
	public static void main(String[] args) {
		// Declarations
		Scanner input = new Scanner(System.in);
		String name = "";
		double worked = 0.0;
		double hourly = 0.0;
		double federal = 0.0;
		double state = 0.0;
		double grossPay = 0.0;
		double federalTax =0.0;
		double net = 0.0;
		double stateTax = 0.0;
		double deduction = 0.0;
		
		// Prompt
		System.out.print("Enter employee name: ");
		name = input.next();
		System.out.print("Enter number of hours worked: ");
		worked = input.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		hourly = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		federal = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		state = input.nextDouble();
		
		// Math
		grossPay = worked * hourly;
		federalTax = grossPay * federal;
		stateTax = grossPay * state;
		deduction = federalTax + stateTax; 
		net = (grossPay -(federalTax + stateTax));
		
		// Display
		// \n new line
		// \t tab
		System.out.printf("Gross Pay: $%.2f\n" , grossPay);
		System.out.printf("Dedcutions: \n");
		System.out.printf("\tFederal Tax: $%.2f\n\tState Tax: $%.2f\n" , federalTax, stateTax);
		System.out.printf("\tTotal deduction: $%.2f" , deduction);
		System.out.printf("\nNet Pay: $%.2f" , net);
	}
}