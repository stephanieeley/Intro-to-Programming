import java.util.*;

// Stephanie Eley 01/29/2020

class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for r: ");
		int r = input.nextInt();
		System.out.print("Is a palindrome: " + isPalindrome(r));
	}
	public static int reverse(int number) {
		String n = Integer.toString(number);
		String s = ("");
		for (int i = n.length()-1;i >= 0; i--) {
			s += n.charAt(i);
		}
		return Integer.parseInt(s);
	}
	public static boolean isPalindrome(int number){
		if (number == reverse(number)){
			return true;
		}
		else {
			return false;
		}
	}
	
}