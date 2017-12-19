import java.util.Scanner;
public class Lab8 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first binary number to add:");
		String add1 = scan.next();
		System.out.print("Enter the second binary number to add:");
		String add2 = scan.next();
		System.out.println(addBinary(add1,add2));
		System.out.print("Enter a base 10 value to be translated:");
		int bten = scan.nextInt();
		System.out.print("Enter a length for the two's complement:");
		int len = scan.nextInt();
		System.out.print(toTwosComplement(bten, len));
		
	}
	
	
	public static String toTwosComplement(int original, int length){
		int quotient = original;
		int remainder = 0;
		String bineq = "";
		String newbineq = "";
		String one = "1";
		String negresult = "";
		if(original >=0){
			while(quotient!=0){
				remainder = quotient%2;
				quotient = quotient/2;
				bineq = bineq + Integer.toString(remainder);
			
					
				}
			char[] binnum = new char[bineq.length()];
			for(int i = 0; i<bineq.length(); i++){
				binnum[i] = bineq.charAt(bineq.length()-i-1);
				newbineq = newbineq + binnum[i];
				
			}
			newbineq = pad(newbineq, length);
			
		}
		else if(original <0){
			original = Math.abs(original);
			quotient = original;
			while(quotient!=0){
				remainder = quotient%2;
				quotient = quotient/2;
				bineq = bineq + Integer.toString(remainder);		
				}
			
			char[] binnum = new char[bineq.length()];
			for(int i = 0; i<bineq.length(); i++){
				binnum[i] = bineq.charAt(bineq.length()-i-1);
				/*if(binnum[i] == '0')
					binnum[i] = '1';
				else{
					binnum[i] = '0';	*/
					
				newbineq = newbineq + binnum[i];	
			}
				//newbineq = newbineq + binnum[i];
			newbineq = pad(newbineq, length);
			//System.out.println(newbineq);
			for(int j = 1; j<newbineq.length() + 1;j++){
				if(newbineq.substring(j-1,  j).equals("0"))
					negresult = negresult + "1";
				else{
					if(newbineq.substring(j-1, j).equals("1"))
					{
						negresult = negresult + "0";
					}
				}
				
			}
			//System.out.println(negresult);
			one = pad(one, negresult.length());
			negresult = addBinary(negresult, one);
			return negresult;
			
		
		}
			
			
			
		
		return newbineq;
			
		}
		//bineq = pad(bineq, length);
		
		
	
	
	/*public static String pad(String nums, int checker){
		if(nums.length()<checker){
			for(int i = 0; i<(checker - nums.length()); i++){
				nums = "0" + nums;
			}
			
			return nums;
			
		}
		else
			return nums;
			
	}*/
	public static String pad(String str, int checker)
	{
		String changed = "";
		
		if(str.length() >= checker)
		{
			return str;
		}
		else
		{
			for(int i = 0; i < checker - str.length(); i ++)
			{
				changed += "0";
			}
			changed += str;
		}
		return changed;
	}
	
	
	public static String addBinary(String s1, String s2)
	{
		int carryBit = 0;
		int sum = 0;
		int maxLength = 0;
		String fin = "";
		String n1 = "";
		String n2 = "";
		
		n1 = pad(s1, s2.length());
		n2 = pad(s2, s1.length());
		
		for(int i = n1.length(); i > 0; i--)
		{
			sum = Integer.parseInt(n1.substring(i-1, i)) + Integer.parseInt(n2.substring(i-1, i));
			if(sum + carryBit == 2)
			{
				carryBit = 1;
				sum = 0;
			}
			else
			{
			if(sum + carryBit == 3)
			{
				carryBit = 1;
				sum = 1;
			}
			else
			{
			if(sum + carryBit == 1)
			{
				carryBit = 0;
				sum = 1;
			}
			else
			{
				carryBit = 0;
				sum = 0;
			}
			}
			}
			fin = sum + fin;
		}
		if(carryBit == 1)
		{
			fin = "1" + fin;
		}
		
		return fin;
	}

	
	
	public static String padStrings(String num1, String num2){
		
		for(int i = 0; i<=(num2.length() - num1.length()); i++){
			num1 = "0" + num1;
		}
		
		return num1;
		
	
		
}
		
	
		
}


