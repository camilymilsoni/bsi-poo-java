package I_Interface_Ex02;

import javax.swing.JOptionPane;

public class ImovelVIEW {

    public static void main(String[] args) {
        
        try{
            CasaDTO casaDTO = new CasaDTO();
            CasaCTR casaCTR = new CasaCTR();
        
            casaDTO.setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietário do imóvel: "));
            casaDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço do imóvel: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do imóvel: ")));
            casaDTO.setBairro(JOptionPane.showInputDialog("Informe o bairro do imóvel: "));
            casaDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade do imóvel: "));
            casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de quartos do imóvel: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de banheiros do imóvel: ")));
        
            JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));               
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
    
}
