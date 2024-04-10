package atividade;

import javax.swing.JOptionPane;

public class Atividade5 {
    public static void main(String args[]) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o sua altura"));
        double imc = peso / altura * altura;

        if (imc < 18.9) {
            JOptionPane.showInternalMessageDialog(null, "Muito Magro");
        } else if (imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Normal");
        } else if (imc < 29.9) {
            JOptionPane.showInternalMessageDialog(null, "Sobrepeso");
        } else if (imc < 39.9) {
            JOptionPane.showInternalMessageDialog(null, "Obeso");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Obesidade Grave");
        }
        JOptionPane.showInternalMessageDialog(null, "esse é seu imc: " + imc);
    }

}
