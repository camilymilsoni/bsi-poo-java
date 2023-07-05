package K_Matriz_Ex01;

public class NumeroDAO {

    private String resposta = "";
    
    public String mostrarMatriz(NumeroDTO numeroDTO){
        
        int n[][] = numeroDTO.getN();
        
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                this.resposta += n[linha][coluna] + " ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    
}
