package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial {

	private JFrame telaInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.telaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		telaInicial = new JFrame();
		telaInicial.setBounds(100, 100, 588, 467);
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaInicial.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente telaCliente = new Cliente();
				telaCliente.setVisible(true);
				
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCadastrar.setBounds(168, 97, 234, 50);
		telaInicial.getContentPane().add(btnCadastrar);
		
		JButton btnOperacoes = new JButton("Acessar sua Conta");
		btnOperacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login telaLogin = new Login();
				telaLogin.setVisible(true);
			}
		});
		btnOperacoes.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnOperacoes.setBounds(168, 191, 234, 50);
		telaInicial.getContentPane().add(btnOperacoes);
	}

	public void setVisible(boolean b) {
		telaInicial.setVisible(true);
		
	}
}
