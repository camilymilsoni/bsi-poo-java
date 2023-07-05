package J_Vetor_Ex02;

import javax.swing.JOptionPane;

public class NumeroOrdemVIEW {

    public static void main(String[] args) {
        
        NumeroOrdemDTO numeroOrdemDTO = new NumeroOrdemDTO();
        NumeroOrdemCTR numeroOrdemCTR = new NumeroOrdemCTR();
        
        int num[] = new int[20];
        
        for(int cont = 0; cont < 20; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para a posição " + cont));
        }
        
        numeroOrdemDTO.setN(num);
        
        JOptionPane.showMessageDialog(null, numeroOrdemCTR.imprimirNumero(numeroOrdemDTO));
        
    }
    
}
