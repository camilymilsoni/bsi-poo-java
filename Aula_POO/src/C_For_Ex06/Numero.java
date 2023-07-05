package C_For_Ex06;

public class Numero {
    
    private int num, maior, menor, i; 
    
    public void verific(int num, int i){
        this.num = num;
        this.i = i;
        
        if(this.i == 0){
            maior = this.num;
            menor = this.num;
        }
        else{
            if(this.num >= maior){
            maior = this.num;
            }
            if(this.num <= menor){
            menor = this.num;
            }
        }
        
    }        
            
    public String result(){
        
        return "O maior número é " + maior + " e o menor número é " + menor + ".";
    }
    
}
