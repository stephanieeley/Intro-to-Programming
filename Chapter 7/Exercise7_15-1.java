import java.util.*;

//Stephanie Eley 02/19/2020


class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] number = new int[10];
		
		System.out.print("Enter " + number.length + " seperated by a space: ");
		for (int i = 0; i < number.length; i++){
			number[i] = input.nextInt();
		}
		
		int[] k = eliminateDuplicates(number);
		int counter = 0;
		System.out.print("Array without duplicates: " );
		for (int i = 0; i < k.length; i++) {
			if (k [i] !=  0 ) {
				counter++;
				System.out.print( k[i] + " ");		
			}
		}
		System.out.print("\nThe number of distinct numbers is: ");
		System.out.print(counter);
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] unique = new int[list.length];
		int index = 0;
		// counter for comparator
		for (int i = 0; i < list.length; i++) {
			// counter for neighbors
			boolean dup = false ;
			for (int j = 0; j < unique.length; j++){
				if ( unique [j] == list [i] ) {
					dup = true;
				}
			}
			if(dup == false ) {
				unique[i] = list[i]; 
				// If unique, add to index[unique], unique++
			} 
		}	
		return unique;
	}
}