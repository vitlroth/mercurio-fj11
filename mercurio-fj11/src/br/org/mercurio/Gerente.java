package br.org.mercurio;

public class Gerente extends Funcionario {
	
	
	int senha;
	int numeroDeFuncGerenc;
	
	
	
	public double getBonificacao() {
		return this.salario * 0.15;
	}
	
	
	
	@Override
	public void descricao() {
	super.descricao();
	System.out.println(" e ele é o Gerente");
	}
	

}



