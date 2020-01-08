import java.util.*;

//Stephanie Eley 01-08-2020

class Exercise2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		double cost = ((distance / miles) * price);
		System.out.println("The cost of driving is "+ cost);
	}
}