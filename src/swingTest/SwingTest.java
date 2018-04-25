package swingTest;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


public class SwingTest{
	
	public SwingTest() {
		JFrame janela = new JFrame("Minha Primeira Janela");
		
		JButton cadastrar = new JButton ("Ok");		
		JButton sair = new JButton("Sair");
		cadastrar.setBounds(50, 100, 90, 30);
		sair.setBounds(170, 100, 90, 30);
	
		JLabel nome = new JLabel();
		nome.setText("Nome:");
		nome.setBounds(30, -65, 100, 200);
		
		JLabel sobrenome = new JLabel();
		sobrenome.setText("Sobrenome:");
		sobrenome.setBounds(30, 20, 100, 100);
		
		JLabel label1 = new JLabel();
		label1.setBounds(40, 70, 250, 170);
	
		JTextField texto = new JTextField();
		JTextField texto1 = new JTextField();
		texto.setBounds(110, 10, 130, 30);
		texto1.setBounds(110,50,130,30);
	
		janela.add(label1);
		janela.add(texto);
		janela.add(texto1);
		janela.add(nome);
		janela.add(sobrenome);
		janela.add(cadastrar);
		janela.add(sair);

	
		janela.setLayout(null);
		janela.setSize(800, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		//janela.setLocationRelativeTo(null);
		cadastrar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label1.setText("Nome cadastrado com sucesso!");
			
		}
	});
		sair.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
}

	public static void main(String[] args) {
		new SwingTest();


	}
	
}
