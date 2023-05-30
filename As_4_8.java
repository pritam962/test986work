
	import java.util.HashMap;
	import java.util.Map;

	public class As_4_8 {
	    public static char getMaxOccurringCharacter(String str) {
	        // Remove whitespace and convert to lowercase
	        str = str.replaceAll("\\s", "").toLowerCase();

	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the occurrence of each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Find the character with the maximum occurrence
	        char maxChar = ' ';
	        int maxCount = 0;
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxChar = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return maxChar;
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        char maxChar = getMaxOccurringCharacter(str);
	        System.out.println("Maximum occurring character: " + maxChar);
	    }
	}

