package I_Interface_Ex01;

import javax.swing.JOptionPane;

public class MotoristaVIEW {

    public static void main(String[] args) {
        
        MotoristaDTO motoristaDTO = new MotoristaDTO();
        MotoristaCTR motoristaCTR = new MotoristaCTR();
        
        motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        
        JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
        
    }
    
}
