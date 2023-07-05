package A_Introducao_Ex04;

import javax.swing.JOptionPane;

public class PrincipalVendas {
    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        
        double sal, vend;
        
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo: "));
        vend = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas: "));
        
        JOptionPane.showMessageDialog(null, vendas.calcularSalVendas(sal, vend));
        
    }
}
