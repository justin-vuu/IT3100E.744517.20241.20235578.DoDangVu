import javax.swing.JOptionPane;
public class Computing {
    public static void main(String[] args){
        String option = JOptionPane.showInputDialog(null,
         "1. First-degree equation \n" +"2. System of first-degree \n" + "3. Second-degree equation \n" , 
         "Please choose the degree", JOptionPane.INFORMATION_MESSAGE);
        if (option.equals("1")){
            String strA = JOptionPane.showInputDialog(null, "Please enter a :", JOptionPane.INFORMATION_MESSAGE);
            String strB = JOptionPane.showInputDialog(null, "Please enter b :", JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            if (a == 0) {
                if (b != 0) {
                    JOptionPane.showMessageDialog(null, "No solution", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "INFINITE SOLUTIONS", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                double sol = -b / a;
                JOptionPane.showMessageDialog(null, "Solution is: " + sol, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (option.equals("2")){
            String str_a11 = JOptionPane.showInputDialog(null,"Please enter a11: ", "a11 = ", JOptionPane.INFORMATION_MESSAGE);
            String str_a12= JOptionPane.showInputDialog(null,"Please enter a12: ");
            String str_a21 = JOptionPane.showInputDialog(null,"Please enter a21: ");
            String str_a22 = JOptionPane.showInputDialog(null,"Please enter a22: ");
            String str_b1 = JOptionPane.showInputDialog(null,"Please enter b1: ");
            String str_b2 = JOptionPane.showInputDialog(null,"Please enter b2: ");
            double a11 = Double.parseDouble(str_a11);
            double a12 = Double.parseDouble(str_a12);
            double a21 = Double.parseDouble(str_a21);
            double a22 = Double.parseDouble(str_a22);
            double b1  = Double.parseDouble(str_b1);
            double b2  = Double.parseDouble(str_b2);

            double det = a11 * a22 - a21 * a12;
            double detx1 = b1 * a22 - b2 * a12;
            double detx2 = a11 * b2 - a21 * b1;
            if (det == 0) {
                if (detx1 == 0 && detx2 == 0) {
                    JOptionPane.showMessageDialog(null, "INFINITE SOLUTIONS.",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SOLUTIONS",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                double x1 = detx1 / det;
                double x2 = detx2 / det;
                JOptionPane.showMessageDialog(null,"The solutions are: x1 = " + x1 + ", x2 = " + x2,
                 "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            String str_a = JOptionPane.showInputDialog(null, "Please enter a ", "a = ", JOptionPane.INFORMATION_MESSAGE);
            String str_b = JOptionPane.showInputDialog(null, "Please enter b ", "b = ", JOptionPane.INFORMATION_MESSAGE);
            String str_c = JOptionPane.showInputDialog(null, "Please enter c ", "c = ", JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(str_a);
            double b = Double.parseDouble(str_b);
            double c = Double.parseDouble(str_c);
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "a cannot be 0", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    JOptionPane.showMessageDialog(null, "NO SOLUTIONS", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "There is one solution\n" + "x = " + x,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "There are two solutions\n" + "x1 = " + x1 + "\nx2 = " + x2,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
}
