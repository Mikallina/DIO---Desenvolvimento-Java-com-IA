package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.ContaCliente;
import model.ContaCorrente;
import model.ContaPoupanca;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Window;

public class Extrato {

	private JFrame telaExtrato;
	private JTable table;
	private DefaultTableModel tableModel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Extrato window = new Extrato();
					window.telaExtrato.setVisible(true);
					window.telaExtrato.requestFocusInWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Extrato() {
		initialize();
		
		
	}


	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		telaExtrato = new JFrame();
		telaExtrato.setBounds(100, 100, 566, 440);
		telaExtrato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaExtrato.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("552px"),},
			new RowSpec[] {
				RowSpec.decode("403px"),}));
		
		JScrollPane scrollPane = new JScrollPane();
		telaExtrato.getContentPane().add(scrollPane, "1, 1, fill, fill");
		
		table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 10));
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "Data", "D�bito", "Cr�dito", "Saldo", "Coment�rios" }
        ));
        scrollPane.setViewportView(table);
        
        tableModel = (DefaultTableModel) table.getModel();
		
	}
	/**
     * Adiciona uma linha de transa��o na tabela de extrato.
     * @param data Data da transa��o
     * @param debito Valor debitado (saque, transfer�ncia)
     * @param credito Valor creditado (dep�sito, transfer�ncia recebida)
     * @param saldo Saldo ap�s a transa��o
     * @param comentarios Coment�rios sobre a transa��o
     */
	
	public void adicionarTransacao(String data, double debito, double credito, double saldo, String comentarios) {
        tableModel.addRow(new Object[] { data, debito, credito, saldo, comentarios });
    }

	public void mostrarExtrato() {
        telaExtrato.setVisible(true);
    }
	

}