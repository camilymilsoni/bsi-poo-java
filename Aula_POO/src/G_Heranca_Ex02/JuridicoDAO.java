package G_Heranca_Ex02;

public class JuridicoDAO extends ClienteDAO{

    public String mostraDadosJur(JuridicoDTO juridicoDTO){
        
        return mostraDadosCli(juridicoDTO) + 
                "\nCNPJ: " + juridicoDTO.getCnpj() +
                "\nI.E.: " + juridicoDTO.getIe();
        
    }
    
}
