import java.util.*;

//Stephanie Eley 01/22/2020

class Exercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter value for n: ");
		int n = input.nextInt();
		printMatrix(n);
	}
		 
		public static void printMatrix(int n){
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int ran = (int)(Math.random() * 2);
					System.out.print(ran + " ");
				}
				System.out.println();
			}
		}
}