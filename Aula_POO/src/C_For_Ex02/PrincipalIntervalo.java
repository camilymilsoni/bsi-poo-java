package C_For_Ex02;

import javax.swing.JOptionPane;

public class PrincipalIntervalo {
    public static void main(String[] args) {
        
        Intervalo intervalo = new Intervalo();
        
        JOptionPane.showMessageDialog(null, 
                intervalo.mostrar(
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")), 
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "))));
        
    }
    
    
}
