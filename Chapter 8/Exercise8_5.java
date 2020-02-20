//Stephanie Eley 02/19/2020

class Exercise8_5 {
	public static void main(String[] args) {
		
		int[][] matrixA = {{3, 8, 2}, {1, 2, 4}, {4, 2, 1}};
		int[][] matrixB = {{1, 3, 5}, {7, 9, 3}, {8, 6, 8}}; 
		addMatrix(matrixA, matrixB);
		}
		
					
	public static void addMatrix(int[][] a, int[][] b){
		int[][] matrixC = new int[3][3]; 				
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a.length; column++) {
			matrixC[row][column] = a[row][column] + b[row][column];
			System.out.print(matrixC[row][column] + " ");
			}
		}	
	}
}