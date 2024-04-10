import javax.swing.JOptionPane;
public class Atividade1 {
    public static void main (String args []) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if (numero > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro numero eh maior que o segundo.");
        } else { JOptionPane.showMessageDialog(null, "O segundo numero é maior que o primeiro"); 
    }
}
}
