package I_Interface_Ex01;

public class MotoristaCTR {

    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String calcular(MotoristaDTO motoristaDTO){
        
        return motoristaDAO.calcular(motoristaDTO);
        
    }
    
}
