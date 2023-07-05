package C_For_Ex03;

public class Soma {
    private int num;
    private int somar;
    
    public void calcSoma(int num){
        this.num = num;
        
        this.somar = this.somar + this.num;
        
    }
    
    public String mostrarSoma(){
        
        return "A soma dos 10 números é: " + this.somar;
    }
    
}
