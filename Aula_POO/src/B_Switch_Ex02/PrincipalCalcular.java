package B_Switch_Ex02;

import javax.swing.JOptionPane;

public class PrincipalCalcular {
    public static void main(String[] args) {
        
        Calcular calcular = new Calcular();
        
        String opcao;
        int n1, n2;
        
        opcao = (JOptionPane.showInputDialog("Informe a operação: "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: "));
        
        JOptionPane.showMessageDialog(null, calcular.operacao(opcao, n1, n2));
        
        
    }
}
