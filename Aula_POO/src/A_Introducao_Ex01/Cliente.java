package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome, rg;
    private int idade;
    
    public void Mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome + "\nO Rg informado foi: " + this.rg);
        //System.out.println("O nome informado foi: " + this.nome + " O Rg informado foi: " + this.rg);
    }
    
    public void mostrarNome(String nome){
        this.nome = nome;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome); //JOptionPane é pra mostrar uma caixinha com as informações
        //System.out.println("O nome informado foi: " + this.nome); //SystemOut não mostra em caixinha, só na área de execução
    }
    
    public void mostrarIdade(int idade){
        this.idade = idade;
        
        JOptionPane.showMessageDialog(null, "A idade informada foi: " + this.idade);
    }
    
}//fecha classe
