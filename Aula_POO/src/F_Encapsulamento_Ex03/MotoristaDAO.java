package F_Encapsulamento_Ex03;

public class MotoristaDAO {

    public String imprimir(MotoristaDTO motoristaDTO){
        
        if(motoristaDTO.getIdade() >= 18){
            return "O motorista pode ter CNH.";
        }
        else{
            return "O motorista não pode ter CNH.";
        }
        
    }
    
}
