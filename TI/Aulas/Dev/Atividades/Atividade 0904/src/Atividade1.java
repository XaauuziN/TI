import javax.swing.JOptionPane;

public class Atividade1 {
    public static void main(String[] args) {

        double valorMercadoria = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da mercadoria"));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a distância em quilômetros"));

        double frete = calcularFrete(valorMercadoria, distancia);
        double total = valorMercadoria + frete;

        JOptionPane.showMessageDialog(null, "Valor do frete: R$" + frete + "\nTotal a ser pago: R$" + total);
    }

    public static double calcularFrete(double valorMercadoria, double distancia) {
        double taxa;

        if (distancia <= 100) {
            taxa = 0;
        } else if (distancia <= 300) {
            taxa = 0.1;
        } else if (distancia <= 500) {
            taxa = 0.175;
        } else if (distancia <= 700) {
            taxa = 0.225;
        } else {
            taxa = 0.335;
        }

        return valorMercadoria * taxa;
    }
}
