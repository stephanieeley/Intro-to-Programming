import java.util.*;

// Stephanie Eley 1/29/2020

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter width: ");
		int width = input.nextInt();
		System.out.print(format (number,width));
		
	}
	public static String format(int number, int width){
		String f = Integer.toString(number);
		int x = width - f.length();
		for (int i = 0; i < x; i++){
			f = "0" + f;
		}
		return f;
		}
	}	
