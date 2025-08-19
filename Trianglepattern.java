package java2;

	public class Trianglepattern {
	    public static void main(String[] args) {
	        int rows = 5; // You can change this value for a bigger triangle

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}

