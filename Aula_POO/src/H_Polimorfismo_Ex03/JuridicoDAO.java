package H_Polimorfismo_Ex03;

public class JuridicoDAO extends ClienteDAO{

    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        
        return super.mostraDadosCli(juridicoDTO) + 
                "\nCNPJ: " + juridicoDTO.getCnpj() + 
                "\nI.E.: " + juridicoDTO.getIe();
        
    }
    
}
