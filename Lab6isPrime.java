import java.util.*;
public class Lab6isPrime {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 2;
		int count = 1;
		int gridPos = 0;
		while(count<=1000){
			isPrime(i);
			if(isPrime(i)==true){
				count++;
				System.out.print(i + " ");
				gridPos++;
				if(gridPos%10==0)
					System.out.println();
			}
			i++;
			
			
		}
		
	}
	public static boolean isPrime(int num){
		for(int i = 2; i<num; i++){
			if(num%i==0){
				return false;
			}
			
		}
		return true;
	}

}
