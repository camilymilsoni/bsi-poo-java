package K_Matriz_Ex02;

public class MatrizCTR {

    MatrizDAO matrizDAO = new MatrizDAO();
    
    public String imprimirMatriz(MatrizDTO matrizDTO){
        
        return matrizDAO.imprimirMatriz(matrizDTO);
    }
    
    public String imprimirDiagonal(MatrizDTO matrizDTO){
        
        return matrizDAO.imprimirDiagonal(matrizDTO);
        
    }
    
}
