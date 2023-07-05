package I_Interface_Ex02;

public class CasaCTR {

    CasaDAO casaDAO = new CasaDAO();
    
    public String publicarDados(CasaDTO casaDTO){
        
        return casaDAO.publicarDados(casaDTO);
                
    }
    
}
