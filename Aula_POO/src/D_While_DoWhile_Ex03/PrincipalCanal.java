package D_While_DoWhile_Ex03;

import javax.swing.JOptionPane;

public class PrincipalCanal {
    public static void main(String[] args) {
        
        Canal canal = new Canal();
        
        int opc = 1;
        
        while(opc != 0){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Informe um canal (9, 12, 23 ou 40) ou 0 para sair: "));
            canal.verific(opc);
        }
        
        JOptionPane.showMessageDialog(null, canal.audiencia());
    }
}
