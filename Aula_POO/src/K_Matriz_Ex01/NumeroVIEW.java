package K_Matriz_Ex01;

import javax.swing.JOptionPane;

public class NumeroVIEW {

    public static void main(String[] args) {
        
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[][] = new int[2][3];
        
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para a linha " + linha + " e coluna " + coluna + ": "));
            }
        }
        
        numeroDTO.setN(num);
        
        JOptionPane.showMessageDialog(null, numeroCTR.mostrarMatriz(numeroDTO));
        
    }
    
}
