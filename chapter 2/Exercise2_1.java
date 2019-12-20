import java.util.*;
import javax.swing.*;

//stephanie eley 12/19/2019

class Exercise2_1 {
	public static void main(String[] args) {
		System.out.println("enter a degree in celsius: ");
		Scanner input = new Scanner(System.in);
		double celsius = input.nextDouble();
		double fahr = (9.0/5) * celsius + 32; 
		System.out.println(celsius + " celsius is " + fahr + " fahrenheit");
	}
}