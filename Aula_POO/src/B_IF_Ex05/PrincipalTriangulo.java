package B_IF_Ex05;

import javax.swing.JOptionPane;

public class PrincipalTriangulo {
    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo();
        
        int ladoA, ladoB, ladoC;
        
        ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o lado A: "));
        ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o lado B: "));
        ladoC = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o lado C: "));
        
        if((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)){
            JOptionPane.showMessageDialog(null, triangulo.calcular(ladoA, ladoB, ladoC));
        }
        else{
            JOptionPane.showMessageDialog(null, "Os valores informados não podem formar um triângulo.");
        }
        
    }
}
