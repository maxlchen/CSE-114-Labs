//Max Chen
//ID: 111316366
import java.util.*;
public class CelsiusToFahrenheit {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double tempC, tempF;
		System.out.println("What is the temperature in Celsius?");
		tempC=scan.nextDouble();
		tempF = (9.0/5)*tempC + 32;
		System.out.println(tempC + " degrees in Celsius is " + tempF + " degrees in Fahrenheit.");
		
		
	}

}
