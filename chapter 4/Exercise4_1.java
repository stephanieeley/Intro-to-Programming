import java.util.*;

//Stephanie Eley 01/14/2020

class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Please enter a value for r: ");
		double r = input.nextDouble();
		double s = ((2 * r) * Math.sin (Math.PI/5));
		double area = ((5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI/5)));
		System.out.print(area);
	
	}
}