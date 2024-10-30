import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Numeric_array {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog("Enter the number of elements:");
        int n = Integer.parseInt(inputStr);  

        double[] array = new double[n];

        
        for (int i = 0; i < n; i++) {
            String elementStr = JOptionPane.showInputDialog("Enter value for element " + (i + 1) + ":");
            array[i] = Double.parseDouble(elementStr);  
        }

        Arrays.sort(array);
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += array[i];
        }
        double avg = sum/n;
        JOptionPane.showMessageDialog(null, "Sorted array: " + Arrays.toString(array), "Array Contents", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"The sum of array is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The average value of array elements is " + avg, "Result", JOptionPane.INFORMATION_MESSAGE);


    }
}
