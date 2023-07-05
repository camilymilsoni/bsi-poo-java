package H_Polimorfismo_Ex02;

import javax.swing.JOptionPane;

public class MediaVIEW {

    public static void main(String[] args) {
        
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")));
        mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")));
        mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: ")));
        mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4: ")));
        mediaDTO.setTipo(Integer.parseInt(JOptionPane.showInputDialog(
                "1 - N1 e N2" + 
                "\n2 - N1, N2 e N3" + 
                "\n3 - N1, N2, N3 e N4" + 
                "\nInforme o tipo de cálculo: ")));
        
        mediaCTR.calcularMedia(mediaDTO);
        JOptionPane.showMessageDialog(null, mediaCTR.imprimir());
        
    }
    
}
