import java.util.*;

//stephanie eley 01/08/2020

class Excercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount for side a: ");
		double a = input.nextDouble();
		System.out.print("Enter the amount for side b: ");
		double b = input.nextDouble();
		System.out.print("Enter the amount for side c: ");
		double c = input.nextDouble();
		
		
		if (a + b <= c || b + c <= a || c + a <= b) {
			System.out.print("Not a valid triangle");
		}
		else {
			System.out.print("The perimeter is: " + (a + b + c));
		}		
	}
}