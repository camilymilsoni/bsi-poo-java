package D_While_DoWhile_Ex03;

public class Canal {
    private String msg;
    private int opc, canal9, canal12, canal23, canal40, canalOutros;
    
    public void verific(int opc){
        this.opc = opc;
        
        switch(this.opc){
            case 9:
                this.canal9 = this.canal9 + 1;
            break;
            case 12:
                this.canal12 = this.canal12 + 1;
            break;
            case 23:
                this.canal23 = this.canal23 + 1;
            break;
            case 40:
                this.canal40 = this.canal40 + 1;
            break;
            default:
                if(this.opc != 0){
                    this.canalOutros = this.canalOutros + 1;
                }
        }
        
    }
     
    public String audiencia(){
        
        this.msg = "Audiência - Canal 9: " + this.canal9 +
              "\nAudiência - Canal 12: " + this.canal12 +
              "\nAudiência - Canal 23: " + this.canal23 +
              "\nAudiência - Canal 40: " + this.canal40 +
              "\nAudiência - Outros Canais: " + this.canalOutros;  
        
        return this.msg;        
    }
            
}
