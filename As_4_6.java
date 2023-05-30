
	public class As_4_6 {
	    public static boolean isPangram(String str) {
	        // Remove whitespace and convert to lowercase
	        str = str.replaceAll("\\s", "").toLowerCase();

	        boolean[] letters = new boolean[26]; // Assuming only lowercase letters (a-z)

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                letters[ch - 'a'] = true;
	            }
	        }

	        for (boolean letter : letters) {
	            if (!letter) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "The quick brown fox jumps over the lazy dog";

	        if (isPangram(str)) {
	            System.out.println(str + " is a pangram.");
	        } else {
	            System.out.println(str + " is not a pangram.");
	        }
	    }
	}
