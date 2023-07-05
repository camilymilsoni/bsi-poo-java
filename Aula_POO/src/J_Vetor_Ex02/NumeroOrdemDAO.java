package J_Vetor_Ex02;

public class NumeroOrdemDAO {

    private String resposta = "";
    
    public String imprimirNumero(NumeroOrdemDTO numeroOrdemDTO){
        
        int n[] = numeroOrdemDTO.getN();
        
        for(int cont = n.length - 1; cont >= 0; cont--){
            this.resposta += n[cont] + "\n";
        }
        return this.resposta;
    }
    
}
