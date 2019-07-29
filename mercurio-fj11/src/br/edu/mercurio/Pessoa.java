/**
 * 
 */
package br.edu.mercurio;

/**
 * @author vitlr
 *
 */
public class Pessoa {

	
	private String pessoa;
	public String getPessoa() {
		return pessoa;
	}
	
	
public void getStringPessoa(){
	
	this.pessoa = "Ola";
	System.out.println(this.getPessoa());
}




public void getMostraView() {
	System.out.println("ola mundo");
}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.getStringPessoa();
	
	}
	
	
	
}
