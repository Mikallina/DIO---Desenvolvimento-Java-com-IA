package model;

public class ContaPoupanca extends ContaCliente {

	public ContaPoupanca(DadosCliente dadosCliente) {
		super(dadosCliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosConta();
	}
	
	
	
}
