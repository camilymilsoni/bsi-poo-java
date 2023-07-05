package K_Matriz_Ex02;

public class MatrizDAO {

    private String resposta = "";
    private String mensagem = "";
    
    public String imprimirMatriz(MatrizDTO matrizDTO){
       
       int n[][] = matrizDTO.getN(); 
       
       for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                this.resposta += n[linha][coluna] + " ";
            }
            this.resposta += "\n";
       }
       return "Matriz: " + "\n" + this.resposta;
        
    }
    
    public String imprimirDiagonal(MatrizDTO matrizDTO){
        
        int n[][] = matrizDTO.getN();
        
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                if(linha == coluna){
                    this.mensagem += n[linha][coluna] + " ";
                }
            }
            this.mensagem += "\n";
        }
        return "Elementos da diagonal principal: " + "\n" + this.mensagem;
    }
    
}
