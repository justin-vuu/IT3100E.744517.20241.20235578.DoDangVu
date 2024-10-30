import javax.swing.JOptionPane;
import java.lang.Math;
public class Operations {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
        Double num2 = Double.parseDouble(strNum2);
        Double strSum = num1 + num2 ;
        Double strDif = Math.abs(num1-num2);
        Double strPro = num1 * num2;
        
        JOptionPane.showMessageDialog(null, strSum, "The sum of 2 double numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strDif, "The difference of 2 double numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strPro, "The product of 2 double numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        if (num2 != 0){
            Double strQuo = num1 / num2;
            JOptionPane.showMessageDialog(null, strQuo, "The quotient of 2 double numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,  "Impossible ");
        }
        
        System.exit(0);
        

    }
}
