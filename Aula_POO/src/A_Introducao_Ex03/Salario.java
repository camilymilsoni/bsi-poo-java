package A_Introducao_Ex03;

public class Salario {
    private double sal, aumento, salarioF;
    
    public double calcularSalFin(double sal, double aumento){
        this.sal = sal;
        this.aumento = aumento;
        
        this.salarioF = ((this.aumento/100)*this.sal + this.sal);
        
        return this.salarioF;
        
    }
    
}
