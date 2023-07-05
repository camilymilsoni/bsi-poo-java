package B_IF_Ex01;

import javax.swing.JOptionPane;

public class PrincipalMedia {
    public static void main(String[] args) {
        Media media = new Media();
        
        double nota1, nota2;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " + media.calcular(nota1, nota2));
        
    }
}
