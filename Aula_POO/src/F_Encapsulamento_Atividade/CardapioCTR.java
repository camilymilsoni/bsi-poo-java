package F_Encapsulamento_Atividade;

public class CardapioCTR {

    CardapioDAO cardapioDAO = new CardapioDAO();
    
    public String imprimir(CardapioDTO cardapioDTO){
        return cardapioDAO.imprimir(cardapioDTO);
    }
    
    public void calcular(CardapioDTO cardapioDTO){
        cardapioDAO.calcular(cardapioDTO);
    }
    
}
