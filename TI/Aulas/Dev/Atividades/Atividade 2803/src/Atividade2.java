import javax.swing.JOptionPane;

public class Atividade2 {

    public static void main(String[] args) {
        int contribuicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos de carteira assinada?"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
        String sexo = JOptionPane.showInputDialog(null, "Coloque seu sexo");
        int soma = (idade + contribuicao);

        if (95 - soma == 0) {
            JOptionPane.showMessageDialog(null,"Você já pode aposentar");
        } else {
            if (sexo.equalsIgnoreCase("Homem")) {
                int tpc = (95 - soma);
                JOptionPane.showMessageDialog(null,"Você aposentará em "+ tpc + " anos ");
            } else if (sexo.equalsIgnoreCase("Mulher")) {
                int tpc = (85 - soma);
                JOptionPane.showMessageDialog(null,"Você aposentará em "+ tpc + " anos ");
            }
        }
    }
}
