package C_For_Ex05;

public class Salario {
    
    private int anoAtual, i;
    private double aumento, salF;
   
    public double calculo(int anoAtual){
        this.anoAtual = anoAtual;
        
        salF = 1000 + (0.015 * 1000);
        aumento = 1.5;
        
        for(i = 1997; i <= anoAtual; i++){
            aumento = aumento * 2;
            salF = (salF + (salF * aumento/100));
            
        }
        return salF;
        
    }
    
}
