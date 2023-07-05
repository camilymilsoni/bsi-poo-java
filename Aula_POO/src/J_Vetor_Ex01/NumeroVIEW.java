package J_Vetor_Ex01;

import javax.swing.JOptionPane;

public class NumeroVIEW {

    public static void main(String[] args) {
        
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[] = new int[5];
        
        for(int cont = 0; cont < 5; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + cont));
        }
        
        numeroDTO.setN(num);
        
        JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
        
    }
    
}
