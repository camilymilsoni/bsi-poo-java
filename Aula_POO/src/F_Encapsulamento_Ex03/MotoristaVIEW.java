package F_Encapsulamento_Ex03;

import javax.swing.JOptionPane;

public class MotoristaVIEW {
    public static void main(String[] args) {
        
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.imprimir(motoristaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}
