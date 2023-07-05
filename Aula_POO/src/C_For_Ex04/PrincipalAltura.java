package C_For_Ex04;

import javax.swing.JOptionPane;

public class PrincipalAltura {
    public static void main(String[] args) {
        
        Altura altura = new Altura();
        
        double alt;
        
        for(int i = 0; i < 20; i++){
            alt = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura " + (i+1) + ": "));
            altura.verific(alt);
        }
        
        JOptionPane.showMessageDialog(null, altura.calcMedia());
        JOptionPane.showMessageDialog(null, altura.maiores());
        
    }
}
