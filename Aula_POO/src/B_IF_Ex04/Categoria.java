package B_IF_Ex04;

public class Categoria {
    private double alt; 
    private double pes;
    private String mensagem;
    
    public String categ(double alt, double pes){
        this.alt = alt;
        this.pes = pes;
        
        if(this.alt < 1.2){
            if(this.pes <= 60){
                this.mensagem = "Categoria A";
            }
            else{
                if((this.pes > 60) && (this.pes <= 90)){
                    this.mensagem = "Categoria D";
                }
                else{
                    this.mensagem = "Categoria G";
                }
            }
        }
        else{
            if((this.alt >= 1.2) && (this.alt <= 1.7)){
                if(this.pes <= 60){
                    this.mensagem = "Categoria B";
                }
                else{
                    if((this.pes > 60) && (this.pes <= 90)){
                        this.mensagem = "Categoria E";
                    }
                    else{
                        this.mensagem = "Categoria H";
                    }
                }
            }
            else{
                if(this.alt > 1.7){
                    if(this.pes <= 60){
                        this.mensagem = "Categoria C";
                    }
                    else{
                        if((this.pes > 60) && (this.pes <= 90)){
                            this.mensagem = "Categoria F";
                        }
                        else{
                            this.mensagem = "Categoria I";
                        }
                    }
                }
            }
        }
        return this.mensagem;
    } 
}
