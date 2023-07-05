package F_Encapsulamento_Atividade;

import javax.swing.JOptionPane;

public class CardapioVIEW {
    public static void main(String[] args) {
        
        try{
            CardapioDTO cardapioDTO = new CardapioDTO();
            CardapioCTR cardapioCTR = new CardapioCTR();
            
            do{
                cardapioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: "
                    + "\n1 - Hambúrguer"
                    + "\n2 - Cheeseburguer"
                    + "\n3 - Misto Quente"
                    + "\n4 - Americano"
                    + "\n5 - Queijo Prato"
                    + "\n0 - Fechar a conta")));
                
                cardapioCTR.calcular(cardapioDTO);
                
                if(cardapioDTO.getCodigo() < 0 || cardapioDTO.getCodigo() > 5){
                    JOptionPane.showMessageDialog(null, "Produto inválido.");
                }
                
            }while(cardapioDTO.getCodigo() != 0);
            
            JOptionPane.showMessageDialog(null, cardapioCTR.imprimir(cardapioDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}
