package J_Vetor_Ex02;

public class NumeroOrdemCTR {

    NumeroOrdemDAO numeroOrdemDAO = new NumeroOrdemDAO();
    
    public String imprimirNumero(NumeroOrdemDTO numeroOrdemDTO){
        
        return numeroOrdemDAO.imprimirNumero(numeroOrdemDTO);
        
    }
    
}
