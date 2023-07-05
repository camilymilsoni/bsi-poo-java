package F_Encapsulamento_Ex05;

import javax.swing.JOptionPane;

public class SoloVIEW {
    public static void main(String[] args) {
        
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
            
            soloDTO.setAmostra(Integer.parseInt(JOptionPane.showInputDialog("Informe a pontuação de água presente na amostra de solo: ")));
            
            JOptionPane.showMessageDialog(null, soloCTR.imprimir(soloDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}
