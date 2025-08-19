package java2;

public class palindrome {
	    public static void main(String[] args) {
	        String input = "madam";
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }
	}