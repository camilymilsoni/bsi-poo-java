package B_IF_Ex02;

import javax.swing.JOptionPane;

public class PrincipalSolo {
    public static void main(String[] args) {
        
        Solo solo = new Solo ();
        
        double pontos;
        
        pontos = Double.parseDouble(JOptionPane.showInputDialog("Informe a pontuação de água presente na amostra coletada: "));
        
        JOptionPane.showMessageDialog(null, solo.classificacao(pontos));
        
    }
}
