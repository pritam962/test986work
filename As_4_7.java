
	public class As_4_7  {
	    public static boolean hasUniqueCharacters(String str) {
	        for (int i = 0; i < str.length() - 1; i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "Hello";
	        if (hasUniqueCharacters(str)) {
	            System.out.println(str + " contains all unique characters.");
	        } else {
	            System.out.println(str + " does not contain all unique characters.");
	        }
	    }
	}