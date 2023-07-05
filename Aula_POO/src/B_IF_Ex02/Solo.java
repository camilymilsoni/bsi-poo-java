package B_IF_Ex02;

public class Solo {
    private double pontos;
    private String resposta;
    
    public String classificacao(double pontos){
        this.pontos = pontos;
        
        if(this.pontos <= 10){
            this.resposta = "O solo é 'Rochoso'.";
        }
        else{
            if((this.pontos > 10) && (this.pontos <= 40)){
                this.resposta = "O solo é 'Firme'.";
            }
            else{
                if((this.pontos > 40) && (this.pontos <= 80)){
                    this.resposta = "O solo é 'Pantanoso'.";
                }
                else{
                    this.resposta = "Quantidade de água inválida.";
                }
            }
        }
        return this.resposta;
    } 
}
