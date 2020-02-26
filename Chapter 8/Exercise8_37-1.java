import java.util.*;

//Stephanie Eley 02/20/2020 

class Exercise8_37 {
	public static void main(String[] args) {
				
		String[][] capitalsOfStates = {{"california", "utah", "new york", "florida", "nevada", "arizona", "idaho", "mississippi", "washington", "texas"} , {"sacramento", "salt lake city", "albany", "tallahassee", "carson city", "phoenix", "bosie", "jackson", "seattle", "austin"}};	
		guessingGame(capitalsOfStates);
	}
	public static void guessingGame(String[][] capitalsOfStates){
		Scanner input = new Scanner(System.in);

		int counter = 0;
		for (int row = 0; row < 10; row++) {
			System.out.println("Enter capital of  the state:  " + capitalsOfStates[0][row]);
			String userAnswer = input.nextLine();
			//System.out.println(capitalsOfStates[1][row]);
			if ( !userAnswer.equals(capitalsOfStates[1][row]) ) {
				System.out.println("Not correct capital " + capitalsOfStates[1][row]);
			}
			else {
				counter++;
				System.out.println(capitalsOfStates[1][row]);
			}
		}
		System.out.print("Correct answers out of 10: " + counter);
	}
}