package H_Polimorfismo_Ex03;

public class ClienteDAO {

    public String mostraDadosCli(ClienteDTO clienteDTO){
        
        return "Nome: " + clienteDTO.getNome() + 
                "\nEndereço: " + clienteDTO.getEndereco() + 
                "\nNúmero: " + clienteDTO.getNumero() + 
                "\nCidade: " + clienteDTO.getCidade() + 
                "\nEstado: " + clienteDTO.getEstado();
        
    }
    
}
