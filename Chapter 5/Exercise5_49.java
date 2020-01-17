import java.util.*;

// Stephanie Eley 01/15/2020

class Exercise5_49 {
	public static void main(String[] args) {
		int vowels = 0;
		int cons =0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String mufasa = input.nextLine().toUpperCase();
		for (int i = 0; i < mufasa.length(); i++) {
			char m = mufasa.charAt(i);
			if (m == 'A' || m == 'E' || m == 'I' || m == 'O' || m == 'U') {
				vowels++;
			}
			else {
				cons++;
			}
		}
		System.out.println("Total number of vowels: " + vowels);
		System.out.println("Total number of cons: " + cons);
	}
}