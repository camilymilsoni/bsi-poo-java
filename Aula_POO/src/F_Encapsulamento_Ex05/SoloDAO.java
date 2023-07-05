package F_Encapsulamento_Ex05;

public class SoloDAO {

    public String imprimir(SoloDTO soloDTO){
        
        if(soloDTO.getAmostra() <= 10){
            return "Solo rochoso.";
        }
        else if((soloDTO.getAmostra() > 10) && (soloDTO.getAmostra() <= 40)){
            return "Solo firme.";
        }
        else if((soloDTO.getAmostra() > 40) && (soloDTO.getAmostra() <= 80)){
            return "Solo pantanoso.";
        }
        else{
            return "Quantidade de água inválida.";
        }
        
    }
    
}
