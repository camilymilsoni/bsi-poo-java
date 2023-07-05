package C_For_Ex02;

public class Intervalo {
    private int n1, n2;
    private String imprimir="";
    
    public String mostrar(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        
        for(int i = this.n1; i <= this.n2; i++){
            this.imprimir = this.imprimir + i + " - ";
        }
        return this.imprimir;
    }
}
