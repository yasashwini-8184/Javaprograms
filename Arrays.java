package java2;
import java.util.*;
public class Arrays {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter n value:");
			int n = sc.nextInt();
			int[][] a = new int[n][3];
			for(int i=0; i<n; i++)
				for(int j=0; j<3; j++)
				    a[i][j] = sc.nextInt();

			for(int i=0; i<n; i++) 
			{
				for(int j=0; j<3; j++)
				    System.out.print(a[i][j] + " ");
				
				System.out.println();
			}

		}
}
