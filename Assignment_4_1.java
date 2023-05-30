package assignment_4_1;

	import java.util.LinkedHashSet;

	public class Assignment_4_1{
	    public static String removeDuplicates(String str) {
	        // Create a LinkedHashSet to maintain the order of characters
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        
	        // Add each character from the string to the set
	        for (int i = 0; i < str.length(); i++) {
	            set.add(str.charAt(i));
	        }
	        
	        // Build the string without duplicates
	        StringBuilder result = new StringBuilder();
	        for (Character ch : set) {
	            result.append(ch);
	        }
	        
	        return result.toString();
	    }
	    
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        String result = removeDuplicates(str);
	        System.out.println(result); // Output: Helo, Wrd!
	    }
	}

