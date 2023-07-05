package G_Heranca_Ex01;

public class VeiculoDAO {
    
    public String imprimiDadosVeiculo(VeiculoDTO veiculoDTO){
        
        return "A Placa é: " + veiculoDTO.getPlaca() +
                "\nA cor é: " + veiculoDTO.getCor();
        
    }
    
}
