package lab21;
import java.util.Scanner;
public class Driver {
	public static int parseHex(String s) throws HexFormatException{
		String digits = "0123456789ABCDEF";
		int deci = 0;
		//converts the hexadecimal number into decimal
		for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		int d = digits.indexOf(c);
		if(d==-1)throw new HexFormatException(d);
		deci = 16*deci + d;
		}
		return deci;
		}
		public static void main(String[] args)throws HexFormatException 
		{  
			System.out.print("Hexadecimal:");

			Scanner input = new Scanner(System.in);
			String Hex = input.nextLine();
			try
			{
				System.out.println("Decimal Equivalent : "+parseHex(Hex));	
			}
			catch(HexFormatException ex)
			{
			System.out.println("Exception occured :(0..9 and A..F are the only valid inputs) "+ex);
			} 
		}
		

}
class HexFormatException extends Exception{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int ex;
	HexFormatException(int s){
		ex =s;
	}
	public String tostring(){
		return(" HexFormatException["+ ex + "] is has lowercase letters");
	}
}