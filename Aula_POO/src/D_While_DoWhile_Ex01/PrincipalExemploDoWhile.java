package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

public class PrincipalExemploDoWhile {
    public static void main(String[] args) {
        int numero;
        ExemploDoWhile exemplodowhile = new ExemploDoWhile();
        
        do{
           numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
           exemplodowhile.somar(numero);
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, exemplodowhile.mostra());
    }
}
