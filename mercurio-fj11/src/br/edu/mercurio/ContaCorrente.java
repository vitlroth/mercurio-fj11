package br.edu.mercurio;

public class ContaCorrente extends Conta {
	
	
	

	
	
	@Override
	public void saca(double qtde) {
		// TODO Auto-generated method stub
	super.saca(qtde * this.saldo * 0.50);
	}
	
	
	
	
	
	public void deposita(double valorDeposito) {
		double novoSaldo = this.saldo + valorDeposito;
		this.saldo = novoSaldo;
	}

}
