package B_IF_Ex05;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private String mensagem;
    
    public String calcular(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
        if((this.ladoA == this.ladoB) && (this.ladoB == this.ladoC)){
            this.mensagem = "O triângulo é equilátero.";
        }
        else{
            if((this.ladoA != this.ladoB) && (this.ladoA != this.ladoC)){
                this.mensagem = "O triângulo é escaleno.";
            }
            else{
                this.mensagem = "O triângulo é isósceles.";
            }
        }
        return this.mensagem;
    }
}
