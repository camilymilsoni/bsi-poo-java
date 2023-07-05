package A_Introducao_Ex04;

public class Vendas {
    private double sal, vend, comissao, salF;
                    
    public String calcularSalVendas (double sal, double vend){
        this.sal = sal;
        this.vend = vend;
        
        this.comissao = 0.04*this.vend;
        this.salF = this.sal + this.comissao;
                
        return "O salário final é " + this.salF + " e a comissão é " + this.comissao;
    }
    
}
