package G_Heranca_Ex02;

public class FisicoDAO extends ClienteDAO{

    public String mostraDadosFis(FisicoDTO fisicoDTO){
        
        return mostraDadosCli(fisicoDTO) + 
                "\nCPF: " + fisicoDTO.getCpf() +
                "\nRG: " + fisicoDTO.getRg();
        
    }
    
}
