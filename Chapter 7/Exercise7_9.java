import java.util.*;
import java.awt.geom.*;

// Stephanie Eley 2/12/2020

class Exercise7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		double [] myList = new double[10];
	
		System.out.print("Enter " + myList.length + " values: ");	
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		}
		System.out.print("The minimum number is: " + min(myList) +  " ");
	}
		public static double min(double[] array){
			double min = array[0];
			int indexOfMin = 0;
			for (int j = 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					indexOfMin = j;
				}
			}
		return min;			
		}
		
	
}