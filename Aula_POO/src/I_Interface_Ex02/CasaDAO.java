package I_Interface_Ex02;

public class CasaDAO implements ICasaDAO{

    private String mensagem;
    
    public String publicarDados(CasaDTO casaDTO){
        
        this.mensagem = "Proprietário: " + casaDTO.getProprietario() +
                "\nEndereço: " + casaDTO.getEndereco() + 
                "\nNúmero: " + casaDTO.getNumero() + 
                "\nBairro: " + casaDTO.getBairro() + 
                "\nCidade: " + casaDTO.getCidade() +
                "\nNúmero de quartos: " + casaDTO.getN_quartos() + 
                "\nNúmero de banheiros: " + casaDTO.getN_banheiros();
        
        return this.mensagem;
        
    }
    
}
