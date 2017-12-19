import java.util.*;
//Maximillian Chen
public class ChangeMaker {

	public static void main(String[] args){
		int penny, nickle, dime, quarter, change;
		Scanner scanChange = new Scanner(System.in);
		System.out.println("How much change in cents is needed? (1-99)");
		change = scanChange.nextInt();
		quarter = change/25;
		change = change%25;
		dime = change/10;
		change = change%10;
		nickle = change/5;
		change = change%5;
		penny = change;
		System.out.println("Number of quarters: " + quarter);
		System.out.println("Number of dimes: " + dime);
		System.out.println("Number of nickles: " + nickle);
		System.out.println("Number of pennies: " + penny);
	
	}
}
