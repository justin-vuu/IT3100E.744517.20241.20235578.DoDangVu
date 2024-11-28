package defaultPackage;
import java.util.Scanner;
 
public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month:");
		String month = scan.nextLine();
		System.out.println("Enter year:");
		int year = scan.nextInt();
		
		if (year < 0) {
			System.out.println("Invalid month/year. Try again.");
			System.exit(0);
		}
		
		String[][] monthName = {
				{},
				{"January", "Jan.", "Jan", "1"},
				{"February", "Feb.", "Feb", "2"},
				{"March", "Mar.", "Mar", "3"},
				{"April", "Apr.", "Apr", "4"},
				{"May", "May", "May", "5"},
				{"June", "June", "Jun", "6"},
				{"July", "July", "Jul", "7"},
				{"August", "Aug.", "Aug", "8"},
				{"September", "Sept.", "Sep", "9"},
				{"October", "Oct.", "Oct", "10"},
				{"November", "Nov.", "Nov", "11"},
				{"December", "Dec.", "Dec", "12"}
		};
		int[] month31 = {1, 3, 5, 7, 8, 10, 12};
		int[] month30 = {4, 6, 9, 11};
		
		for (int i = 1; i <= 12; ++i) {
			for (int j = 0; j <= 3; ++j) {
				if (month.equals(monthName[i][j]) == false) continue;
				for (int k = 0; k < 7; ++k) {
					if (i != month31[k]) continue;
					System.out.println("31 days");
					System.exit(0);
				}
				for (int k = 0; k < 4; ++k) {
					if (i != month30[k]) continue;
					System.out.println("30 days");
					System.exit(0);
				}
				if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
					System.out.println("28 days");
				else
					System.out.println("29 days");
				System.exit(0);
			}
		}
		System.out.println("Invalid month/year. Try again.");
	}

}
