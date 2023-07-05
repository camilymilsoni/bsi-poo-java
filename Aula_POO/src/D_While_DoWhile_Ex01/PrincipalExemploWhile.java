package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

public class PrincipalExemploWhile {
    public static void main(String[] args) {
        
        int numero = 1;
        
        ExemploWhile exemplowhile = new ExemploWhile();
        
        while(numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemplowhile.somar(numero);
        }
        
        JOptionPane.showMessageDialog(null, exemplowhile.mostra());
        
    }
}
