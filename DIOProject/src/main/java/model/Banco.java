package model;
import java.util.List;

public class Banco {
	private  String nome;
	private List<ContaCliente> contaClientes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ContaCliente> getContas() {
		return contaClientes;
	}

	public void setContas(List<ContaCliente> contaClientes) {
		this.contaClientes = contaClientes;
	}
	
	
	
}
