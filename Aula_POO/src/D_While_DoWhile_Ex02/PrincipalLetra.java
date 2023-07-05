package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

public class PrincipalLetra {
    public static void main(String[] args) {
        
        Letra letra = new Letra();
        
        String let="";
        
        while(!let.equalsIgnoreCase("0")){
            let = JOptionPane.showInputDialog("Informe uma letra: ");
            letra.verific(let);
        }
        
        JOptionPane.showMessageDialog(null, letra.qtd());
    }
}
