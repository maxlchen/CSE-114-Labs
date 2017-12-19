//Max Chen
//ID: 111316366
import java.util.*;
public class RestaurantBill {
	public static void main(String[] args){
		double subtotal, tip, total;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please senter the subtotal: ");
		subtotal = scan.nextDouble();
		if(subtotal<=30)
			tip = 5.00;
		else
			tip = .15*subtotal;
		total = tip + subtotal;
		total =  Math.round(total * 100.0) / 100.0;
		System.out.println("The gratuity is $" + tip + " and the total bill is $" + total);
		
	}

}
