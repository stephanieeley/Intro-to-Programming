import java.util.*;

//stephanie eley 01/07/2020

public class Exercise2_13{
	public static void main(String[] args) {
		System.out.println("how much do you want to save per month:");
		Scanner input = new Scanner(System.in);
		Double savings = input.nextDouble();
		Double totals = savings * (1 + 0.00417);
		totals = (savings + totals) * (1 + 0.00417);
		totals = (savings + totals) * (1 + 0.00417);
		totals = (savings + totals) * (1 + 0.00417);
		totals = (savings + totals) * (1 + 0.00417);
		totals = (savings + totals) * (1 + 0.00417);		
		System.out.println("After the sixth month " + totals);
	}
}