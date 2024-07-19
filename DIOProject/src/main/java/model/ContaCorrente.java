package model;

public class ContaCorrente extends ContaCliente {

	public ContaCorrente(DadosCliente dadosCliente) {
		super(dadosCliente);
		
	}


	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosConta();
		
	}

	
	
	
}
