package C_For_Ex05;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PrincipalSalario {
    public static void main(String[] args) {
        DecimalFormat formatando = new DecimalFormat("##,###.00");
        Salario salario = new Salario();
        
        int anoAtual;
        
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
        
        JOptionPane.showMessageDialog(null, "O salário atual desse funcionário é: R$" + formatando.format(salario.calculo(anoAtual)));
        
    }
    
}
