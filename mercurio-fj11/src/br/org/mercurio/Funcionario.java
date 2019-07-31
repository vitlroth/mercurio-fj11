package br.org.mercurio;

public class Funcionario {
	
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	
	public void descricao() {
		System.out.println("O Funcionario é :" + this.nome + " e possui um salário de : " + this.getSalario());
	}
	
	
	

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}



	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}



	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
