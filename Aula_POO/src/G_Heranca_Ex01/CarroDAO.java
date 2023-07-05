package G_Heranca_Ex01;

public class CarroDAO extends VeiculoDAO{

    public String imprimiDadosCarro(CarroDTO carroDTO){
        
        return imprimiDadosVeiculo(carroDTO) + 
                "\nA Potência é: " + carroDTO.getPotencia() +
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
    
}
