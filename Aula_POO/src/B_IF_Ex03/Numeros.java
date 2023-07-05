package B_IF_Ex03;

public class Numeros {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private String mensagem;
    
    public String ordem(int num1, int num2, int num3, int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        
        if(this.num4 < this.num1){
            this.mensagem = this.num3 + " - " + this.num2 + " - " + this.num1 + " - " + this.num4;
        }
        else{
            if(this.num4 < this.num2){
                this.mensagem = this.num3 + " - " + this.num2 + " - " + this.num4 + " - " + this.num1;
            }
            else{
                if(this.num4 < this.num3){
                    this.mensagem = this.num3 + " - " + this.num4 + " - " + this.num2 + " - " + this.num1;
                }
                else{
                    this.mensagem = this.num4 + " - " + this.num3 + " - " + this.num2 + " - " + this.num1;
                }
            }
        }
        return this.mensagem;
    }
}
