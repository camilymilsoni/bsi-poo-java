package F_Encapsulamento_Ex04;

public class MediaDAO {
    
    private double media;
    
    public String calcular(MediaDTO mediaDTO){
        
        this.media = ((mediaDTO.getNota1() + mediaDTO.getNota2()) / 2);
        
        if(this.media >= 7){
            return "A média é " + this.media + " e o aluno está aprovado.";
        }
        else{
            if((this.media >= 4) && (this.media < 7)){
                return "A média é " + this.media + " e o aluno está de recuperação.";
            }
            else{
                return "A média é " + this.media + " e o aluno está reprovado.";
            }
        }
        
    }
    
}
