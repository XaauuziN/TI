import javax.swing.JOptionPane;
public class Atividade1 {

    public static void main(String[] args) {
        
        int  idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua Idade"));
        
        if (idade <= 0){
            JOptionPane.showMessageDialog(null, "Idade incorreta");
        } else if(idade <= 15) {
            JOptionPane.showMessageDialog(null, "Não Eleitor");
        } else{
            if (idade <= 17) {
                JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
            } else {
                if (idade <=64) {
                    JOptionPane.showMessageDialog(null, "Eleitor OBRIGATORIO!");
                } else {
                    if (idade >= 65) {
                        JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
                    }
                        }
                    }
                }
            }
        }
    

