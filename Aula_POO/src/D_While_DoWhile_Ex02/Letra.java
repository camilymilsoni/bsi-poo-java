package D_While_DoWhile_Ex02;

public class Letra {
    private String let, resp;
    private int vogalA, vogalE, vogalI, vogalO, vogalU, consoante;
    
    public void verific(String let){
        this.let = let;
        
        switch(let.toUpperCase()){
            case "A":
                vogalA = vogalA + 1;
            break;
            case "E":
                vogalE = vogalE + 1;
            break;
            case "I":
                vogalI = vogalI + 1;
            break;
            case "O":
                vogalO = vogalO + 1;
            break;
            case "U":
                vogalU = vogalU + 1;
            break;
            default:
                if(!let.equals("0")){
                    consoante = consoante + 1;
                }
        }
        
    }
    
    public String qtd(){
        
        resp = "Vogal A: " + vogalA +
                "\nVogal E: " + vogalE +
                "\nVogal I: " + vogalI +
                "\nVogal O: " + vogalO +
                "\nVogal U: " + vogalU +
                "\nConsoante: " + consoante;
        
        return resp;
    }
    
    
}
