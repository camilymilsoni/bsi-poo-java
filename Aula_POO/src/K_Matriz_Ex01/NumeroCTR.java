package K_Matriz_Ex01;

public class NumeroCTR {

    NumeroDAO numeroDAO = new NumeroDAO();
    
    public String mostrarMatriz(NumeroDTO numeroDTO){
        
        return numeroDAO.mostrarMatriz(numeroDTO);
        
    }
    
}
