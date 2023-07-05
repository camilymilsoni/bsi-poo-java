package C_For_Ex04;

public class Altura {
    
    private double alt;
    private int qtd;
    private double soma;
    private double media;
    
    public void verific (double alt){
        this.alt = alt;
        
        this.soma = this.soma + alt;
        
        if(this.alt > 2){
            this.qtd = this.qtd + 1;
        }
        
    }
    
    public String calcMedia (){
        
        this.media = this.soma / 20;
        
        return "A média das alturas é: " + this.media;
    }
    
    public String maiores (){
        
        return "A quantidade de pessoas com mais de 2 metros é: " + this.qtd;
    }
    
}
