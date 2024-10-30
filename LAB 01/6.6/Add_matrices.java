import javax.swing.JOptionPane;

public class Add_matrices {
    public static void main(String[] args){
        String inputRow = JOptionPane.showInputDialog("Enter the number of rows :");
        int n_r = Integer.parseInt(inputRow);  
        String inputCol = JOptionPane.showInputDialog("Enter the numbers of columns: ");
        int n_c = Integer.parseInt(inputCol);
        double[][] matrix_1 = new double[n_r][n_c];
        double[][] matrix_2 = new double[n_r][n_c];
        for (int i = 0; i< n_r; i++){
            for (int j = 0; j <n_c; j++){
                String input_ele = JOptionPane.showInputDialog("Enter the element " +i + j);
                matrix_1[i][j] = Double.parseDouble(input_ele); 
            }
        }
        for (int i = 0; i< n_r; i++){
            for (int j = 0; j <n_c; j++){
                String input_ele = JOptionPane.showInputDialog("Enter the element " +i + j);
                matrix_2[i][j] = Double.parseDouble(input_ele); 
            }
        }
        double[][] result = new double[n_r][n_c];
        for (int i = 0; i < n_r; i++) {
            for (int j = 0; j < n_c; j++) {
                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        StringBuilder resultStr = new StringBuilder();
        resultStr.append("Resulting Matrix:\n");
        for (int i = 0; i < n_r; i++) {
            for (int j = 0; j < n_c; j++) {
                resultStr.append(result[i][j]).append(" ");
            }
            resultStr.append("\n");
        }

    
        JOptionPane.showMessageDialog(null, resultStr.toString(), "Matrix Addition Result", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
