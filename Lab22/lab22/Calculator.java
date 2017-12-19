//Name: Max Chen
//Student ID: 111316366
//Stony Brook University
//CSE 114
//Fall 2017
//Lab 22
package lab22;
import java.util.*;
public class Calculator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an expressinon separated by whitespace");
		String operation = scan.nextLine();
		calculate(operation);
	}
	public static void calculate(String expression) {
		int posOperator = expression.indexOf(' ') + 1;
		double a;
		double b;
		//if(Double.parseDouble(expression.substring(0, posOperator)) throws NumberFormatException || Double.parseDouble(expression.substring(posOperator + 1))){
			
		//
		a = 0;
		b = 0;
		try{
		a = Double.parseDouble(expression.substring(0, posOperator));
		b = Double.parseDouble(expression.substring(posOperator + 1));
		}
		catch(NumberFormatException NFE){
			System.out.println("At least one number is invalid");
			System.exit(0);
		}
		
		
		try{
			if(expression.charAt(posOperator) == '+'){
				System.out.println(a + b);
			}
			else if(expression.charAt(posOperator) == '-'){
				System.out.println(a - b);
			}
			else if(expression.charAt(posOperator) == '*'){
				System.out.println(a * b);
			}
			else if(expression.charAt(posOperator) == '/'){
				if(b==0)
					throw new ArithmeticException("Division by zero is illegal");
				else{
					System.out.println(a / b);
				}
			}
			else if(expression.charAt(posOperator) == '*'){
				System.out.println(a * b);
			}
			else if(expression.charAt(posOperator) == '%'){
				System.out.println(a % b);
			}
			else{
				throw new ArithmeticException(expression.charAt(posOperator) + " is an invalid operator");
			}
		}
		catch(ArithmeticException AE){
			System.out.println(AE.getMessage());
		}
	}

}
