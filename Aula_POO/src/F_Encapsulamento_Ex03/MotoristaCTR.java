package F_Encapsulamento_Ex03;

public class MotoristaCTR {

    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String imprimir(MotoristaDTO motoristaDTO){
        return motoristaDAO.imprimir(motoristaDTO);
    }
    
}
