package B_Switch_Ex01;

import javax.swing.JOptionPane;

public class PrincipalExemplo {
    public static void main(String[] args) {
        
        Exemplo exemplo = new Exemplo();
        
        int op, n1, n2;
        
        op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação: "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: "));
        
        JOptionPane.showMessageDialog(null, exemplo.calcular(op, n1, n2));
        
        
    }
    
    
    
}
