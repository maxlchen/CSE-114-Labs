//Max Chen
///111316366
package lab15;
import java.util.*;
public class Lab15Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a1, b1, a2, b2;
		Complex c1, c2;
		System.out.println("Enter the first complex number");
		String complex1 = scan.nextLine();
		if(complex1.indexOf('+')!=-1){
		a1 = Double.parseDouble(complex1.substring(0, complex1.indexOf('+')));
		b1 = Double.parseDouble(complex1.substring(complex1.indexOf('+') + 1, complex1.indexOf('i')));
		}
		else if(complex1.indexOf('i') == -1){
			a1 = Double.parseDouble(complex1);
			b1 = 0;
		}
		else{
			a1 = 0;
			b1 = Double.parseDouble(complex1.substring(0, complex1.indexOf('i')));
		}
		if(a1==0 && b1 ==0)
			c1 = new Complex();
		else if(a1 !=0 && b1 == 0){
			c1 = new Complex(a1);
		}
		else
			c1 = new Complex(a1, b1);
		System.out.println("Enter the second complex number");
		String complex2 = scan.nextLine();
		if(complex2.indexOf('+')!=-1){
		a2 = Double.parseDouble(complex2.substring(0, complex2.indexOf('+')));
		b2 = Double.parseDouble(complex2.substring(complex2.indexOf('+') + 1, complex2.indexOf('i')));
		}
		else if(complex2.indexOf('i') == -1){
			a2 = Double.parseDouble(complex2);
			b2 = 0;
		}
		else{
			a2 = 0;
			b2 = Double.parseDouble(complex2.substring(0, complex2.indexOf('i')));
		}
		if(a2==0 && b2 ==0)
			c2 = new Complex();
		else if(a2 !=0 && b2 == 0){
			c2 = new Complex(a2);
		}
		else
			c2 = new Complex(a2, b2);
		System.out.println("Complex 1 + Complex 2: " + Complex.add(c1, c2));
		System.out.println("Complex 1 - Complex 2: " + Complex.subtract(c1, c2));
		System.out.println("Complex 1 * Complex 2: " + Complex.multiply(c1, c2));
		System.out.println("Complex 1 / Complex 2: " + Complex.divide(c1, c2));


		
		

	}

}
