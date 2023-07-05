package H_Polimorfismo_Ex03;

public class FisicoCTR {

    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        
        return fisicoDAO.mostraDadosCli(fisicoDTO);
        
    }
    
}
