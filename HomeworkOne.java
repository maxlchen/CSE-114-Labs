// CSE 114 Homework 1
//
// Fall 2017, Stony Brook University
//
// Name: Maximillian Chen
// SBU ID #: 111316366

import java.util.*; // needed for the Scanner class

public class HomeworkOne
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Test the getFees() method
        System.out.print("Enter the starting account balance: ");
        double bal = sc.nextDouble();
        sc.nextLine(); // consume the extra newline character
        System.out.print("Enter the number of checks that were written: ");
        int checks = sc.nextInt();
        sc.nextLine(); // consume extra newline
        double fee = getFees(bal, checks);
        System.out.println("You paid $" + fee + " in fees.\n");
        
        
        // Test the addDivisors() method
        System.out.print("Enter an integer to process: ");
        int val = sc.nextInt();
        sc.nextLine(); // consume any leftover newline characters
        int sum = addDivisors(val);
        System.out.println("Sum of proper divisors: " + sum + "\n");
        
        
        // Test the getGender() method
        System.out.print("Please enter the name of the Bynar you are speaking to: ");
        String bName = sc.nextLine();
        String gender = getGender(bName);
        System.out.println("This Bynar is " + gender + "\n");
        
        
        // Test the "index of coincidence" method
        System.out.print("Enter a string to examine: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string to examine: ");
        String s2 = sc.nextLine();
        double index = coincidence(s1, s2);
        System.out.println("These strings have an index of coincidence of " + index + "\n");

    }
    
    
    
    // COMPLETE THE METHODS BELOW FOR HOMEWORK 1
    
    public static double getFees (double balance, int checks)
    {
        // Fill in this method for the homework
        if(balance>=400){
        	if(checks>=1 && checks<=19)
        		return (10+.1*checks);
        	else if(checks>=20 && checks<=39)
        		return (10+ .08*checks);
        	else if(checks>=40 && checks<=59)
        		return (10 + .06 * checks);
        	else
        		return (10 + .04 * checks);
        }
        else {
        	if(checks>=1 && checks<=19)
        		return (25 + .10* checks);
        	else if(checks>=20 && checks<=39)
        		return (25 + .08*checks);
        	else if(checks>=40 && checks<=59)
        		return (25 + .06*checks);
        	else
        		return (25 + .04*checks);
        	
        }
    }
    
    
    public static int addDivisors (int input)
    {
        
        int x = 1;
        int sum = 0;
        while(x<input){
        	if(input%x==0){
        		sum = sum + x;
        		x++;
        	}
        	else
        		x++;
        }
        return sum;
    }
    
    
    public static String getGender (String name)
    {
        // Fill in this method for the homework
        
        int oneCounter=0;
        for(int x = 0; x<name.length(); x++){
        	if(name.substring(x,x+1).equals("1")){
        		
        		oneCounter++;        		
        	}
        	
        }
        if(oneCounter%2==0)
        	return "female";
        else
        	return "male";
    }
    
    public static double coincidence (String first, String second)
    {
        // Fill in this method for the homework
        
        int coincidenceCounter = 0;
        for(int x = 0; x<first.length(); x++){
        	if(first.substring(x,x+1).equals(second.substring(x,x+1))){
        		coincidenceCounter++;
        		
        	}
        	
        }
        double coincidenceProportion = ((double)coincidenceCounter/first.length())*100;
        coincidenceProportion = Math.round(coincidenceProportion*10.0)/10.0;
        return coincidenceProportion; 
    }
    
    
}
