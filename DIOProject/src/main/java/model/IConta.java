package model;

public interface IConta {
	
	 
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, ContaCliente contaDestino);
	void imprimirExtrato();

}


//Interface