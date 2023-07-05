package B_IF_Ex03;

import javax.swing.JOptionPane;

public class PrincipalNumeros {
    public static void main(String[] args) {
        
        Numeros numeros = new Numeros ();
        
        int num1, num2, num3, num4;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número: "));
        
        JOptionPane.showMessageDialog(null, "A ordem decrescente dos números informados é: " + numeros.ordem(num1, num2, num3, num4));
        
    }
}
