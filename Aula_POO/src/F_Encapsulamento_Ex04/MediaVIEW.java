package F_Encapsulamento_Ex04;

import javax.swing.JOptionPane;

public class MediaVIEW {
    public static void main(String[] args) {
        
        try{
            MediaDTO mediaDTO = new MediaDTO();
            MediaCTR mediaCTR = new MediaCTR();
            
            mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")));
            mediaDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")));
            
            JOptionPane.showMessageDialog(null, mediaCTR.calcular(mediaDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}
