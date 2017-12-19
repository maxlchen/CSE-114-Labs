//Max Chen
//111316366
import java.util.*;

public class Lab11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] markov = new double[3][3];
		System.out.println("Enter a matrix that has values of a 3x3 array, one row at a time:");
		for(int j = 0; j<markov.length; j++){
			for(int k = 0; k<markov[0].length; k++){
				markov[j][k] = scan.nextDouble();
			}
		}
		boolean isMarkov = isMarkovMatrix(markov);
		if(isMarkov){
			System.out.println("This is a positive markov matrix.");
			
		}
		else
			System.out.println("This is not a positive markov matrix");
		System.out.println("Enter a size for a Magic Square:");
		int matrixSize = scan.nextInt();
		scan.close();
		int[][] squareMatrix = new int [matrixSize][matrixSize];
		squareMatrix = createSquare(matrixSize);
		for(int j = 0; j<squareMatrix.length; j++){
			for(int k = 0; k<squareMatrix[0].length; k++){
				if(k == matrixSize - 1){
					System.out.print(squareMatrix[j][k] + " ");
					System.out.println();
				}
				else
					System.out.print(squareMatrix[j][k] + "   ");
			}
		}
		
			
		

	}
	public static boolean isMarkovMatrix(double[][] m){
		boolean isPositive = isPositive(m);
		if(!isPositive)
			return false;
		for(int i =0; i<m[0].length; i++){
			if((m[0][i] + m[1][i] + m[2][i] != 1)){
				return false;
			}
				
		}
		return true;
		
	}
	public static boolean isPositive(double[][] arr){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[0].length; j++){
				if(arr[i][j]<=0)
					return false;
			}
		}
		return true;
	}
	public static int [][] createSquare(int size){
		int[][] square = new int [size][size];
		double startposdouble = size/2;
		int startpos = (int) Math.ceil(startposdouble);
		square[0][startpos] = 1;
		int colpos = startpos;
		int rowpos = 0;

		int originalrow;
		int originalcos;
		for(int i = 2; i <= size*size; i++){
			originalrow = rowpos;
			originalcos = colpos;
			rowpos--;
			colpos--;
			if(rowpos<0)
				rowpos = size - 1;
			if(colpos<0)
				colpos = size - 1;
			if(square[rowpos][colpos]==0)
				square[rowpos][colpos] = i;
			else{
				//while(square[rowpos][colpos]!=0){
				rowpos = originalrow;
				colpos = originalcos;
				rowpos++;
				if(rowpos>size-1)
					rowpos = 0;
				if(colpos>size - 1)
					colpos = 0;
				//}
				square[rowpos][colpos] = i;
			}
			
			
		}
		return square;
		//loop to check for null
		//method to check for row and col being negative?
		
		
	}

}
