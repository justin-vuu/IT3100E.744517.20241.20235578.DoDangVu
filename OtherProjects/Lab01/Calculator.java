import javax.swing.JOptionPane;
public class Calculator {
	public static void main(String[] args) {
		String a, b;
		a = JOptionPane.showInputDialog(null, "Enter a: ", "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
		b = JOptionPane.showInputDialog(null, "Enter b: ", "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		String result = "a + b = " + (x + y) + "\na - b = " + (x - y) + "\na * b = " + (x * y);
		if (y == 0) result += "\nCan not be divided by 0";
		else result += "\na / b = " + (x / y);
		JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}