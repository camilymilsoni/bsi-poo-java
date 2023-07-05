package A_Introducao_Ex03;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        double sal, aumento;
        
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: "));
        aumento = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento: "));
        
        JOptionPane.showMessageDialog(null, "O salário final é: " + salario.calcularSalFin(sal, aumento));
        
    }
    
}
