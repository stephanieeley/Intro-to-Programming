import java.util.*;

//stephanie eley 01.08.2020

class Exercise3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter amount for a: ");
		double a = input.nextDouble();	
		System.out.print("enter amount for b: ");		
		double b = input.nextDouble();
		System.out.print("enter amount for c: ");
		double c = input.nextDouble();	
		System.out.print("enter amount for d: ");		
		double d = input.nextDouble();
		System.out.print("enter amount for e: ");	
		double e = input.nextDouble();
		System.out.print("enter amount for f: ");	
		double f = input.nextDouble();
	
		if((a * d - b * c) == 0){
			System.out.println("There is no solution");
		}		
		else{
			double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
			double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));		
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
	
		}
	}
}