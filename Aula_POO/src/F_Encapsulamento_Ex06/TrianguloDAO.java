package F_Encapsulamento_Ex06;

public class TrianguloDAO {
  
    public String verific(TrianguloDTO trianguloDTO){
        
        if(((trianguloDTO.getLadoA() + trianguloDTO.getLadoB()) > trianguloDTO.getLadoC()) && 
           ((trianguloDTO.getLadoA() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoB()) && 
           ((trianguloDTO.getLadoB() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoA())){
           return tipoTriangulo(trianguloDTO); 
        }else{
            return "Os lados informados não formam um triângulo.";
        }
        
    }
    
    public String tipoTriangulo(TrianguloDTO trianguloDTO){
        
        if((trianguloDTO.getLadoA() == trianguloDTO.getLadoB()) && (trianguloDTO.getLadoB() == trianguloDTO.getLadoC())){
            return "O triângulo é do tipo equilátero.";
        }
        else if((trianguloDTO.getLadoA() != trianguloDTO.getLadoB()) && (trianguloDTO.getLadoB() != trianguloDTO.getLadoC())){
            return "O triângulo é do tipo escaleno.";
        }
        else{
            return "O triângulo é do tipo isósceles.";
        }
        
    }
    
}
