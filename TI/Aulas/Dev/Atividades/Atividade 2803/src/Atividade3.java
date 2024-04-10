import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String[] args) {

        String mediaBd = JOptionPane.showInputDialog(null, "Insira a média em Banco de Dados");
        String mediaPa = JOptionPane.showInputDialog(null, "Insira a média em Programação Avançada");
        int frequencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de faltas"));

        
        if (mediaBd.equalsIgnoreCase("I") || mediaPa.equalsIgnoreCase("I") || frequencia >= 93.75) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado");
        } else {
            
            if ((mediaBd.equalsIgnoreCase("MB") || mediaBd.equalsIgnoreCase("B") || mediaBd.equalsIgnoreCase("R")) &&
                    (mediaPa.equalsIgnoreCase("MB") || mediaPa.equalsIgnoreCase("B") || mediaBd.equalsIgnoreCase("R"))
                    ||
                    frequencia <= 93.75) {
                JOptionPane.showMessageDialog(null, "Aluno Aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno Reprovado");
            }
        }
    }
}
