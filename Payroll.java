//Max Chen
//ID: 111316366
import java.util.*;
public class Payroll {
	public static void main(String[] args){
		String name = null;
		Scanner scan = new Scanner(System.in);
		double hoursWorked, hourlyPay, fedTax, stateTax;
		System.out.print("Enter employee's name: ");
		name = scan.nextLine();
		System.out.print("Enter the number of hours worked this week: ");
		hoursWorked = scan.nextDouble();
		System.out.print("Enter the hourly pay rate: ");
		hourlyPay = scan.nextDouble();
		System.out.print("Enter the federal tax withholding rate: ");
		fedTax = scan.nextDouble();
		System.out.print("Enter the state tax withholding rate: ");
		stateTax = scan.nextDouble();
		double gross = hourlyPay*hoursWorked;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyPay);
		System.out.println("Gross Pay: $" + gross + "\n");
		System.out.println("Deductions:\n");
		System.out.println("Federal Withholding (" + (fedTax*100.0) + "%): $" + fedTax*gross);
		System.out.println("State Withholding (" + (stateTax*100.0) + "%): $" + stateTax*gross + "\n");
		System.out.println("Total Deduction: $" + ((fedTax*gross) + (stateTax*gross)) + "\n");
		System.out.println("Net Pay: $" + (gross - ((fedTax*gross) + (stateTax*gross))));
		
		
		
		
		
	}

}
