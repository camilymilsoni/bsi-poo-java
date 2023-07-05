package C_For_Ex03;

import javax.swing.JOptionPane;

public class PrincipalSoma {
    public static void main(String[] args) {
        
        Soma soma = new Soma();
        
        int num;
        
        for(int i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (i+1) + ": "));
            soma.calcSoma(num);
        }
        
        JOptionPane.showMessageDialog(null, soma.mostrarSoma());
        
    }
}
