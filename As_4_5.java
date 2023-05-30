package as_4_5;

	public class As_4_5 {
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove whitespace and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        int[] frequency1 = new int[26]; // Assuming only lowercase letters (a-z)
	        int[] frequency2 = new int[26];

	        for (int i = 0; i < str1.length(); i++) {
	            frequency1[str1.charAt(i) - 'a']++;
	            frequency2[str2.charAt(i) - 'a']++;
	        }

	        for (int i = 0; i < 26; i++) {
	            if (frequency1[i] != frequency2[i]) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}
