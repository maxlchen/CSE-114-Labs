//Max Chen
//ID: 111316366
import java.util.*;
public class DaysOfMonth {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int year, month;
		int days = 0;
		String monthName = null;
		System.out.print("Please enter the month (1-12): ");
		month = scan.nextInt();
		System.out.print("Please enter the year: ");
		year = scan.nextInt();
		switch(month)
		{
		case 1:
			monthName = "January";
			days = 31;
			break;
		case 2:
			monthName = "February";
			if(year%4!=0)
				days = 28;
			else if(year%100!=0)
				days = 29;
			else if(year%400!=0)
				days = 28;
			break;
		case 3:
			monthName = "March";
			days = 31;
			break;
		case 4:
			monthName = "April";
			days = 30;
			break;
		case 5:
			monthName = "May";
			days = 31;
			break;
		case 6:
			monthName = "June";
			days = 30;
			break;
		case 7:
			monthName = "July";
			days = 31;
			break;
		case 8:
			monthName = "August";
			days = 31;
			break;
		case 9:
			monthName = "September";
			days = 30;
			break;
		case 10:
			monthName = "October";
			days = 31;
			break;
		case 11:
			monthName = "November";
			days = 30;
			break;
		case 12:
			monthName = "December";
			days = 31;
			break;
		default:
			break;
		
		
		}
		System.out.println(monthName + " " + year + " has " + days + " days.");
		

	}
}
