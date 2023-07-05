package B_Switch_Ex02;

public class Calcular {
    int num1, num2;
    String opc;
    
    public String operacao(String opc, int num1, int num2){
        this.opc = opc.toUpperCase();
        this.num1 = num1;
        this.num2 = num2;
        
        switch(this.opc){
            case "A":
                return "O resultado é: " + (this.num1 + this.num2);
            case "S":
                return "O resultado é: " + (this.num1 - this.num2);
            case "M":
                return "O resultado é: " + (this.num1 * this.num2);
            case "D":
                return "O resultado é: " + (this.num1 / this.num2);
            default:
                return "Operação inválida";
            
            
        }
        
    }
    
}
