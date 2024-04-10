import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String args[]) {

        String sexo = JOptionPane.showInputDialog("Você é homem ou mulher?");
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em cm: "));
        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso"));
        int valor = 58;
        double valor2 = 44.7;
        

        if (sexo.equalsIgnoreCase("mulher")) {
            double pesoid2 = (peso *altura - valor2);
            JOptionPane.showMessageDialog(null,"Seu peso ideal é:" + pesoid2);

        } else if (sexo.equalsIgnoreCase("Homem")) {
            double pesoid = (peso * altura - valor);
            JOptionPane.showMessageDialog(null, "Seu peso ideal é:" + pesoid);
        }
        JOptionPane.showInternalMessageDialog(null, "\nSeu nome é:" + nome
                                                                   + "\nSua altura é:" + altura
                                                                   + "\nSeu sexo é:" + sexo
                                                                   + "\nSua idade é:" + idade
                                                                   + "\nSeu peso ideal é:");
    }
}