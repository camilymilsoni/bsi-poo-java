package G_Heranca_Ex02;

public class JuridicoCTR {

    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String mostraDadosJur(JuridicoDTO juridicoDTO){
        
        return juridicoDAO.mostraDadosJur(juridicoDTO);
    }
    
}
