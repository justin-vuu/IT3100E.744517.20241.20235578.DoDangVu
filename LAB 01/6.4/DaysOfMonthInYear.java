import java.util.Scanner;

public class DaysOfMonthInYear {
    static String[][] months = {
        {"Jan.", "Jan", "1", "January"},
        {"Feb.", "Feb", "2", "February"},
        {"Mar.", "Mar", "3", "March"},
        {"Apr.", "Apr", "4", "April"},
        {"May", "May", "5", "May"},
        {"Jun.", "Jun", "6", "June"},
        {"Jul.", "Jul", "7", "July"},
        {"Aug.", "Aug", "8", "August"},
        {"Sep.", "Sep", "9", "September"},
        {"Oct.", "Oct", "10", "October"},
        {"Nov.", "Nov", "11", "November"},
        {"Dec.", "Dec", "12", "December"}
    };
    public static boolean isvalidmonth(String input) {
        for (String[] month_set : months) {
            for (String month : month_set) {
                if (month.equals(input)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getmonthnum(String input) {
        for (int i =0; i < 12 ; i++){
			for (int j = 0; j <4; j++){
				if (months[i][j].equals(input)){
					return i +1;
				}
			}
		}
		return -1;
    }

    public static boolean isleapyear(int input) {
        if (input % 4 != 0) {
            return false;
        } else if (input % 100 == 0 && input % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String monthInput;
        while (true) {
            System.out.println("Enter a month: ");
            monthInput = input.next();
            if (isvalidmonth(monthInput)) {
                break;
             } else {
                System.out.println("Month input is invalid. Try again.");
             }
        }
        int n = getmonthnum(monthInput);
        int yearInput;
        while (true) {
            System.out.println("Enter a year: ");
            yearInput = input.nextInt();
            if (yearInput > 0) {
                break;
            } else {
                System.out.println("Year input is invalid. Try again.");
            }
        }
        int[] days30 = {4, 6, 9, 11};
        int[] days31 = {1, 3, 5, 7, 8, 10, 12};
        for (int i = 0; i < days30.length; i++) {
            if (n == days30[i]) {
                System.out.println("30");
            }
        }
        for (int i = 0; i < days31.length; i++) {
            if (n == days31[i]) {
                System.out.println("31");
            }
        }
        if (n == 2) {
            if (isleapyear(yearInput)) {
                System.out.println("29");
            } else {
                System.out.print("28");
            }
        }
    }   
}