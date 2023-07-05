package F_Encapsulamento_Atividade;

public class CardapioDAO {
    
    private int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0;
    private double valorT = 0;
    private String mensagem = "";
    
    public void calcular(CardapioDTO cardapioDTO){
        
        if(cardapioDTO.getCodigo() == 1){
            this.qtd1 = this.qtd1 + 1;
        }
        else if(cardapioDTO.getCodigo() == 2){
            this.qtd2 = this.qtd2 + 1;
        }
        else if(cardapioDTO.getCodigo() == 3){
            this.qtd3 = this.qtd3 + 1;
        }
        else if(cardapioDTO.getCodigo() == 4){
            this.qtd4 = this.qtd4 + 1;
        }
        else if(cardapioDTO.getCodigo() == 5){
            this.qtd5 = this.qtd5 + 1;
        }
        else if(cardapioDTO.getCodigo() == 0){
            this.valorT = (this.qtd1 * 1.50) + (this.qtd2 * 1.80) + (this.qtd3 * 1.20) + (this.qtd4 * 2.00) + (this.qtd5 * 1.00);
            
            if(this.qtd1 > 0){
                this.mensagem = this.mensagem + "Hambúrguer" + "             " + this.qtd1 + "               R$" + (this.qtd1 * 1.50);
            }
            if(this.qtd2 > 0){
                this.mensagem = this.mensagem + "\nCheeseburguer" + "       " + this.qtd2 + "               R$" + (this.qtd2 * 1.80);
            }
            if(this.qtd3 > 0){
                this.mensagem = this.mensagem + "\nMisto Quente" + "            " + this.qtd3 + "               R$" + (this.qtd3 * 1.20);
            }
            if(this.qtd4 > 0){
                this.mensagem = this.mensagem + "\nAmericano" + "                " + this.qtd4 + "               R$" + (this.qtd4 * 2.00);
            }
            if(this.qtd5 > 0){
                this.mensagem = this.mensagem + "\nQueijo Prato" + "             " + this.qtd5 + "               R$" + (this.qtd5 * 1.00);
            }
        }
    }
    
    public String imprimir(CardapioDTO cardapioDTO){
        
        return "----------------------------------------------------"
                + "\nProduto    |    Quantidade    |    Valor"
                + "\n----------------------------------------------------"
                + "\n" + this.mensagem
                + "\n----------------------------------------------------"
                + "\nTotal: R$" + this.valorT;
        
    }
    
}
