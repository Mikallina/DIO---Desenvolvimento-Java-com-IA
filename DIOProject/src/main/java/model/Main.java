package model;

public class Main {

	public static void main(String[] args) {
		
		DadosCliente dadosCliente = new DadosCliente();
		dadosCliente.setNome("Michelle");
		ContaCliente cc = new ContaCorrente(dadosCliente);
		ContaCliente cp = new ContaPoupanca(dadosCliente);
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
