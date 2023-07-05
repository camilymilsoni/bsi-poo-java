package G_Heranca_Ex01;

public class CarroCTR {

    CarroDAO carroDAO = new CarroDAO();
    
    public String imprimiDadosCarro(CarroDTO carroDTO){
        
        return carroDAO.imprimiDadosCarro(carroDTO);
        
    }
    
}
