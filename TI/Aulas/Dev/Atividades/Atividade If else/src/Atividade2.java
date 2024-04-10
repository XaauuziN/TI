import javax.swing.JOptionPane;

public class Atividade2 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa:");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa:"));

        if (idade > idade2) {
            JOptionPane.showMessageDialog(null, "A primeira pessoa é " + nome + "\nSua idade é " + idade);
        } else {
            JOptionPane.showMessageDialog(null, "A segunda pessoa é " + nome2 + "\nSua idade é " + idade2);
        }
    }
}