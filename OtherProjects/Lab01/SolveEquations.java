import javax.swing.JOptionPane;
import java.lang.Math;
public class SolveEquations {
	public static void main(String[] args) {
		String choose = JOptionPane.showInputDialog(null, "Which type of equation do you want to solve? Enter: \n'1' for The first-degree equation (linear equation) with one variable\n'2' for The system of first-degree equations (linear system) with two variables\n'3' for The second-degree equation with one variable",
						"Choose the type of equation", JOptionPane.INFORMATION_MESSAGE);
		double num = Double.parseDouble(choose);
		String result = "Result";
		if (num == 1) {
			String eq = "Solve ax + b = 0";
			String x = JOptionPane.showInputDialog(null, "Enter a:", eq, JOptionPane.INFORMATION_MESSAGE);
			String y = JOptionPane.showInputDialog(null, "Enter b:", eq, JOptionPane.INFORMATION_MESSAGE);
			double a = Double.parseDouble(x), b = Double.parseDouble(y);
			if (a == 0) {
				if (b == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.", result, JOptionPane.INFORMATION_MESSAGE);
				else JOptionPane.showMessageDialog(null, "No solutions.", result, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "x = " + (-b / a), result, JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (num == 2) {
			String eq = "Solve a11x1 + a12x2 = b1 and a21x1 + a22x2 = b2";

			String x11 = JOptionPane.showInputDialog(null, "Enter a11:", eq, JOptionPane.INFORMATION_MESSAGE);
			String x12 = JOptionPane.showInputDialog(null, "Enter a12:", eq, JOptionPane.INFORMATION_MESSAGE);
			String x1 = JOptionPane.showInputDialog(null, "Enter b1:", eq, JOptionPane.INFORMATION_MESSAGE);
			
			String x21 = JOptionPane.showInputDialog(null, "Enter a21:", eq, JOptionPane.INFORMATION_MESSAGE);
			String x22 = JOptionPane.showInputDialog(null, "Enter a22:", eq, JOptionPane.INFORMATION_MESSAGE);
			String x2 = JOptionPane.showInputDialog(null, "Enter b2:", eq, JOptionPane.INFORMATION_MESSAGE);
			
			double a11 = Double.parseDouble(x11), a12 = Double.parseDouble(x12), b1 = Double.parseDouble(x1);
			double a21 = Double.parseDouble(x21), a22 = Double.parseDouble(x22), b2 = Double.parseDouble(x2);
			
			double d = a11 * a22 - a21 * a12, d1 = b1 * a22 - b2 * a12, d2 = a11 * b2 - a21 * b1;
			if (d != 0) {
				JOptionPane.showMessageDialog(null, "x1 = " + (d1 / d) + "\nx2 = " + (d2 / d), result, JOptionPane.INFORMATION_MESSAGE);
			} else {
				if (d1 == 0 && d2 == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.", result, JOptionPane.INFORMATION_MESSAGE);
				else JOptionPane.showMessageDialog(null, "No solutions.", result, JOptionPane.INFORMATION_MESSAGE);
			}
			
		} else if (num == 3) {
			String eq = "Solve ax^2 + bx + c = 0";
			String x = JOptionPane.showInputDialog(null, "Enter a:", eq, JOptionPane.INFORMATION_MESSAGE);
			String y = JOptionPane.showInputDialog(null, "Enter b:", eq, JOptionPane.INFORMATION_MESSAGE);
			String z = JOptionPane.showInputDialog(null, "Enter c:", eq, JOptionPane.INFORMATION_MESSAGE);
			
			double a = Double.parseDouble(x), b = Double.parseDouble(y), c = Double.parseDouble(z);
			double d = b * b - 4 * a * c;
			if (a == 0) {
				if (b == 0) {
					if (c == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.", result, JOptionPane.INFORMATION_MESSAGE);
					else JOptionPane.showMessageDialog(null, "No solutions.", result, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "x = " + (-c / b), result, JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				if (d == 0) JOptionPane.showMessageDialog(null, "x = " + (-b / (2 * a)), result, JOptionPane.INFORMATION_MESSAGE);
				else JOptionPane.showMessageDialog(null, "x1 = " + ((-b + Math.sqrt(d)) / (2 * a)) + "\nx2 = " + ((-b - Math.sqrt(d)) / (2 * a)),
												result, JOptionPane.INFORMATION_MESSAGE);
			}

		} else {
			JOptionPane.showMessageDialog(null, "No such type of equation.", "Error", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}