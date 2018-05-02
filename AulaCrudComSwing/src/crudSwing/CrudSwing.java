package crudSwing;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import pessoa.Pessoa;

public class CrudSwing {
	private static ArrayList<Pessoa> pessoas;
	public CrudSwing() {
		JFrame f = new JFrame("Cadastro");
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
		
		JLabel lblNome = new JLabel("Nome:");
		f.add(lblNome);
		lblNome.setBounds(10, 10, 100, 30);
		
		JLabel lblCpf = new JLabel("CPF:");
		f.add(lblCpf);
		lblCpf.setBounds(10, 50, 100,  30);
		
		JTextField txtNome = new JTextField();
		f.add(txtNome);
		txtNome.setBounds(70, 10, 100, 30);
		
		JTextField txtCpf = new JTextField();
		f.add(txtCpf);
		txtCpf.setBounds(70, 50, 100, 30);
		
		JButton btSalvar = new JButton("Salvar");
		f.add(btSalvar);
		btSalvar.setBounds(40, 90, 80, 30);
		
		JButton btExibir = new JButton("Exibir");
		f.add(btExibir);
		btExibir.setBounds(130, 90, 80, 30);
		
		btExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				JFrame f2 = new JFrame("Cadastro");
				f2.setVisible(true);
				f2.setSize(800, 600);
				f2.setLocationRelativeTo(null);
				f2.setLayout(null);
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f2.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
				
				JLabel lblBuscaCpf = new JLabel("Digite o CPF:");
				f2.add(lblBuscaCpf);
				lblBuscaCpf.setBounds(10, 10, 100, 30);
				
				JTextField txtBuscaCpf = new JTextField();
				f2.add(txtBuscaCpf);
				txtBuscaCpf.setBounds(90, 10, 100, 30);
				
			}
		});
		btSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				txtNome.setText("");
				txtCpf.setText("");
				if (!cpf.equals("")) {
					cadastrarPessoa(nome, cpf);
					JOptionPane.showMessageDialog(null, nome + " nome cadastrado");
				} else {
					JOptionPane.showMessageDialog(null, "Cpf vazio");
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		new CrudSwing();
		pessoas = new ArrayList<>();
	}
	public static void cadastrarPessoa(String nome, String cpf){
		Pessoa pessoa = new Pessoa(nome, cpf);
		pessoas.add(pessoa);
	}
}
