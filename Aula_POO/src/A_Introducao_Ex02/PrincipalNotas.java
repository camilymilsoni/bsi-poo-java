package A_Introducao_Ex02;

import javax.swing.JOptionPane;

public class PrincipalNotas {
    public static void main(String[] args) {
        Notas notas = new Notas();
        
        double n1, n2, n3, p1, p2, p3;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: "));
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 1: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 2: "));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 3: "));
        
        JOptionPane.showMessageDialog(null, "A média é: " + notas.calcularMedia(n1, n2, n3, p1, p2, p3));
        
    }
    
}
