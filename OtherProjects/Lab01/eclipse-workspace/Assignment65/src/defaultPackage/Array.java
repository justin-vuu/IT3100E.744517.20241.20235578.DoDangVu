package defaultPackage;
import java.util.Scanner;
 
public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scan.nextInt();
		System.out.println("Enter the array:");
		int[] a = new int[n + 5];
		for (int i = 1; i <= n; ++i)
			a[i] = scan.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			for (int j = i + 1; j <= n; ++j) {
				if (a[i] < a[j]) continue;
				int tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
			}
		}
		
		System.out.println("The array after being sorted:");
		for (int i = 1; i <= n; ++i)
			System.out.print(a[i] + " ");
		System.out.println("");
		
		int sum = 0;
		for (int i = 1; i <= n; ++i) sum += a[i];
		System.out.println("Sum of the array: " + sum);
		System.out.println("Average value: " + ((float)sum / n));
	}

}
