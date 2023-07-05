package I_Interface_Ex01;

public class MotoristaDAO {

    private String mensagem;
    
    public String calcular(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.mensagem = "O motorista pode ter CNH.";
        }
        else{
            this.mensagem = "O motorista NÃO pode ter CNH.";
        }
        return this.mensagem;
    }
    
}
