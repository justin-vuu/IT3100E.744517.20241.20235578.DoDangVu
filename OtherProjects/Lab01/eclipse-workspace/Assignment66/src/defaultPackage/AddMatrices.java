package defaultPackage;
 
import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scan.nextInt();
		System.out.println("Enter m:");
		int m = scan.nextInt();
		int[][] a = new int[n + 5][m + 5], b = new int[n + 5][m + 5];
		System.out.println("Enter matrix a:");
		for (int i = 1; i <= n; ++i)
			for (int j = 1; j <= m; ++j)
				a[i][j] = scan.nextInt();
		System.out.println("Enter matrix b:");
		for (int i = 1; i <= n; ++i)
			for (int j = 1; j <= m; ++j)
				b[i][j] = scan.nextInt();
		System.out.println("Sum of two matrices:");
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j)
				System.out.print((a[i][j] + b[i][j]) + " ");
			System.out.println("");
		}
	}
}
