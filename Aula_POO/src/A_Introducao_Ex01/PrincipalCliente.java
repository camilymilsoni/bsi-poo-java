package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class PrincipalCliente {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        String nome, rg;
        int idade;
        
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        rg = JOptionPane.showInputDialog("Informe o RG: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")); //Integer.parseInt para converter para int
        
        cliente.Mostrar(nome, rg);
        cliente.mostrarNome(nome);
        cliente.mostrarIdade(idade);
        
    }
}
