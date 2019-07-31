package br.edu.mercurio;

/**
 * Classe de teste sem modificadores de acesso
 * 
 * @author vitlr
 *
 */
public class Conta {

	int numero;
	double salario;
	double saldo;
	double limite;

	/**
	 * Para cada conta criada já tera um novo cliente associado sem a necessidade de
	 * instancialo.
	 */
	//public Cliente cliente = new Cliente();
	
	
	
	// Clinte não esta instanciado
	Cliente titular;


	void saca(double qtde) {
		double novoSaldo = this.saldo - qtde;
		this.saldo = novoSaldo;
	}

	public void deposita(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	
	private boolean verificaSaldo(double valor) {
		if(valor>=this.saldo) {
			return true;
		}else {
			return false;
		}
	}
					
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.verificaSaldo(valor);
		
		if(retirou) {
			destino.deposita(valor);
			return true;
		}
			return false;							
	}
	
	
	
	
	
	
}
