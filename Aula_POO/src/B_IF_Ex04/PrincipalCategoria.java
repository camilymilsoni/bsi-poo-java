package B_IF_Ex04;

import javax.swing.JOptionPane;

public class PrincipalCategoria {
    public static void main(String[] args) {
        
        Categoria categoria = new Categoria();
        
        double alt, pes;
        
        alt = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
        pes = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
        
        JOptionPane.showMessageDialog(null, "A classificação dessa pessoa é: " + categoria.categ(alt, pes));
        
    }
}
