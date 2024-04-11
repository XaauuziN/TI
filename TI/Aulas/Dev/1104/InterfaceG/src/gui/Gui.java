package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Gui extends JFrame {

	private JPanel contentPane;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 957, 628);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Gabriel L. Felicio");
		lblName.setForeground(Color.CYAN);
		lblName.setBackground(new Color(0, 0, 255));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD, 38));
		lblName.setBounds(275, 208, 362, 79); /*coluna,linha, largura, altura*/
		contentPane.add(lblName);
		
		JLabel Descricao = new JLabel("Programador");
		Descricao.setForeground(Color.WHITE);
		Descricao.setFont(new Font("Adobe Arabic", Font.PLAIN, 18));
		Descricao.setHorizontalAlignment(SwingConstants.CENTER);
		Descricao.setBounds(314, 269, 284, 38);
		contentPane.add(Descricao);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(203, 390, 385, 22);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("E:\\TI\\Aulas\\Dev\\1104\\Imagens\\icons8-github-30.png"));
		lblNewLabel.setBounds(324, 315, 38, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\TI\\Aulas\\Dev\\1104\\Imagens\\icons8-linkedin-30.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(394, 315, 38, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\TI\\Aulas\\Dev\\1104\\Imagens\\icons8-instagram-30.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(465, 315, 44, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Download CV");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(72, 471, 164, 43);
		contentPane.add(btnNewButton);
	}
}
