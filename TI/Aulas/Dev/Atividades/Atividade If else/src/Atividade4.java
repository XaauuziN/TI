import javax.swing.JOptionPane;

public class Atividade4 {
    public static void main(String[] args) {

        double preco = Double.parseDouble(JOptionPane.showInputDialog("insira o salario"));
        if (preco <= 1000){
             preco = preco* 1.2;
            JOptionPane.showInternalMessageDialog(null, "Salario reajustado" + preco);
    }  else {
        preco = preco* 1.1;
        JOptionPane.showInternalMessageDialog(null, "Salario reajustado" + preco);
    }
}
}
