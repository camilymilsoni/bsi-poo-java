package C_For_Ex06;

import javax.swing.JOptionPane;

public class PrincipalNumero {
    public static void main(String[] args) {
        
        Numero numero = new Numero();
        
        int num, i;
        
        for(i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            numero.verific(num, i);
        }
        
        JOptionPane.showMessageDialog(null, numero.result());
    }
    
}
