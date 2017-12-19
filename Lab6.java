import java.util.*;
public class Lab6 {
	public static void main(String[] args){
		long milli;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of milliseconds:");
		milli = scan.nextLong();
		System.out.print(convertMillis(milli));
		
			
		}
	public static String convertMillis(long millis){
		long hours, minutes, seconds;
		hours = millis/3600000;
		millis = millis - hours*3600000;
		minutes = millis/60000;
		millis = millis - minutes * 60000;
		seconds = millis/1000;
		return (hours + ":"+minutes + ":" + seconds);
		
	}

}
