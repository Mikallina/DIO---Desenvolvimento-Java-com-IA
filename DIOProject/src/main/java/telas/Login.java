package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.CadastroCliente;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.util.List;

public class Login {

	private JFrame telaLogin;
	private JButton btnAcessar;
	private JPasswordField passwordField;
	private boolean cpfFieldEmpty = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.telaLogin.setVisible(true);
					window.telaLogin.requestFocusInWindow(); // Definindo o foco na janela após ela ser visível
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		telaLogin = new JFrame();
		telaLogin.setBounds(100, 100, 450, 300);
		telaLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acesse sua Conta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(145, 10, 151, 22);
		telaLogin.getContentPane().add(lblNewLabel);
		
		new JTextField();
		final JFormattedTextField txtCpf = new JFormattedTextField(createFormatter("###.###.###-##"));
		txtCpf.setForeground(Color.GRAY);
		txtCpf.setText("");
		txtCpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtCpf.setColumns(10);
		txtCpf.setBounds(100, 84, 227, 19);
		telaLogin.getContentPane().add(txtCpf);
	
		txtCpf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (cpfFieldEmpty) {
					txtCpf.setText("");
					cpfFieldEmpty = false;
				}
			}
			
			public void focusLost(FocusEvent e) {
				if (txtCpf.getText().isEmpty()) {
					txtCpf.setText("CPF");
					cpfFieldEmpty = true;
				}
			}
			
		});
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.GRAY);
		passwordField.setText("");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (cpfFieldEmpty) {
					passwordField.setText("");
					cpfFieldEmpty = false;
				}
			}
			
			@SuppressWarnings("deprecation")
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().isEmpty()) {
					passwordField.setText("Senha");
					cpfFieldEmpty = true;
				}
			}
			
		});
		
		passwordField.setBounds(100, 127, 227, 19);
		telaLogin.getContentPane().add(passwordField);
		
		
		btnAcessar = new JButton("Acessar");
		btnAcessar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtCpf.getText();
				String senhaTexto = new String(passwordField.getPassword());
				
				// Buscar cliente cadastrado na lista estática
				List<CadastroCliente> clientesCadastrados = CadastroCliente.getClientesCadastrados();
				CadastroCliente clienteCadastrado = null;
				for (CadastroCliente cliente : clientesCadastrados) {
					if (cliente.getCpf().equals(cpf)) {
						clienteCadastrado = cliente;
						break;
					}
				}
				
				// Verificar se encontrou o cliente e validar a senha
				if (clienteCadastrado != null && clienteCadastrado.getSenha() == Integer.parseInt(senhaTexto)) {
					JOptionPane.showMessageDialog(telaLogin, "Login bem-sucedido!");
					
					// Abrir a tela de operações ou outra tela desejada
					Operacoes telaOperacoes = new Operacoes(clienteCadastrado);
					telaOperacoes.setVisible(true);
					
					// Fechar a tela de login
					telaLogin.dispose();
				} else {
					JOptionPane.showMessageDialog(telaLogin, "CPF ou senha inválidos. Tente novamente.");
				}
			}
		});
		btnAcessar.setBounds(100, 178, 227, 21);
		telaLogin.getContentPane().add(btnAcessar);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 84, 41, 16);
		telaLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(30, 130, 52, 16);
		telaLogin.getContentPane().add(lblNewLabel_1_1);
	}

	public void setVisible(boolean b) {
		telaLogin.setVisible(true);
	}
	
	public MaskFormatter createFormatter(String s) {
		MaskFormatter formatter = null;
		try {
			formatter = new MaskFormatter(s);
			formatter.setPlaceholderCharacter(' ');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return formatter;
	}
}