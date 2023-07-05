package F_Encapsulamento_Ex06;

public class TrianguloCTR {

    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String imprimir(TrianguloDTO trianguloDTO){
        return trianguloDAO.verific(trianguloDTO);
    }
    
}
