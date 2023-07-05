package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class PrincipalCliente1 {
    public static void main(String[] args) {
        Cliente1 cliente1 = new Cliente1();
        
        int ano_nasc, ano_atual;
        
        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
        
        JOptionPane.showMessageDialog(null, "A idade em anos é: " + 
                cliente1.calcularIdade(ano_nasc, ano_atual));
        
    }
    
}
