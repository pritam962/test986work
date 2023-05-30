
	import java.util.HashMap;
	import java.util.Map;

	public class Assignment_4_2 {
	    public static void printDuplicates(String str) {
	        // Create a HashMap to store character frequencies
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        // Count the frequency of each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print characters with frequency greater than 1
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        System.out.println("Duplicate characters:");
	        printDuplicates(str);
	    }
	}

