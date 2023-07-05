package H_Polimorfismo_Ex03;

public class JuridicoCTR {

    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        
        return juridicoDAO.mostraDadosCli(juridicoDTO);
        
    }
    
}
