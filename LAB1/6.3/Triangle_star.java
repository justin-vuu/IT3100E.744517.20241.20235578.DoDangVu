import javax.swing.JOptionPane;
public class Triangle_star {
    public static void main(String[] args){
        String n_star = JOptionPane.showInputDialog(null,"Please enter the n","n = ", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(n_star);
        if (n%2 == 0 ){
            n++;
        }
        String result = "";
        for(int i = 1; i <  n+1; i++){
            result += " ".repeat(n  - i) + "*".repeat(2*i -1) + " ".repeat(n  - i) + "\n";         
        }
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
