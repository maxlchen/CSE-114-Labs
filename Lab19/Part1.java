package lab19;
import java.util.*;
public class Part1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length, N, for the Fibonacci sequence");
		int n = scan.nextInt();
		System.out.println("Enter the number of terms, P, to print");
		int p = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		int sumToAdd = 0;
		for(int i = 2; i < n; i++){
			sumToAdd = array.get(i - 1) + array.get(i - 2);
			array.add(sumToAdd);
			
		}
		System.out.println("Last " + p + " array values:");
		for(int i = n - p; i < n; i++){
			System.out.print(array.get(i) + " ");
			
		}
		
	}

}
