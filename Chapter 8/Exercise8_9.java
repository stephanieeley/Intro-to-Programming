import java.util.*;

//stephanie eley 02/26/2020

class Exercise8_9 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		String[][] ticTacToe = {{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
		//call 
		boolean game = true;
		String turn = "X";
		int count = 0;
		while (game){
			System.out.print("\nEnter a row (0, 1, 2) for player " + turn + ": ");
			int row  = input.nextInt();
			System.out.print("Enter a column (0, 1, 2) for player " + turn + ": ");
			int column = input.nextInt();
			
			while(ticTacToe[row][column].equalsIgnoreCase("x") || ticTacToe[row][column].equalsIgnoreCase("o")){
					System.out.println("Please pick a valid spot");
					System.out.print("\nEnter a row (0, 1, 2) for player " + turn + ": ");
					row  = input.nextInt();
					System.out.print("Enter a column (0, 1, 2) for player " + turn + ": ");
					column = input.nextInt();
			}
			ticTacToe[row][column]= turn; 
			fillBoxes(ticTacToe);
			if(turn.equalsIgnoreCase("x")){
				turn = "O";
				count++;
			}
			else {
				turn = "X";
				count++;
			}		
			if(count == 9){
				game = false;
			}
		}
	}
	public static void fillBoxes(String[][] ticTacToe) {
		
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.print(ticTacToe[row][column] +  " ");
			}
		System.out.println();
		}		
	}
}