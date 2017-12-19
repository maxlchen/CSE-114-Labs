package lab19;
import java.util.*;

public class Part2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Welsh word:");
		String wel = scan.next();
		ArrayList<String> welsh = new ArrayList<String>();
		welsh = welshLetters(wel);
		scan.close();
		System.out.println("Welsh letters: " + welsh.size() + welsh);
		

	}
	
	   public static ArrayList welshLetters(String word) {
	        String[] letters = {"ch", "dd", "ff", "ng", "ll", "ph", "rh", "th"};
	        ArrayList<String> welsh = new ArrayList<>();
	        boolean found;
	        while (!word.isEmpty()) {
	            found = false;
	            for(int i = 0; i < letters.length; ++i) {
	                if(word.startsWith(letters[i])) {
	                    welsh.add(letters[i]);
	                    word = word.replaceFirst(letters[i], "");
	                    found = true;
	                }
	            }
	            if(!found) {
	                welsh.add("" + word.charAt(0));
	                word = word.substring(1);
	            }
	        }
	        return welsh;
	    }
	    
	    

	    

	
	
}
