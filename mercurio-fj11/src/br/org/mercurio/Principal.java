package br.org.mercurio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gerente g = new Gerente();
		g.setNome("Luis");
		g.setSalario(2000);
		System.out.println(g.getBonificacao());
		
		
		
		
		Funcionario f = new Gerente();
		f.setNome("Totonho");
		f.setSalario(2000);
		System.out.println(f.getBonificacao());
		
		
		
		Funcionario fx = new Funcionario();
		fx.setNome("Lili");
		fx.setSalario(2000);
		System.out.println(fx.getBonificacao());
		System.out.println("RELATORIO DE ATIVIDADES");
		fx.descricao();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		g.descricao();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		f.descricao();
		
		System.out.println("Polimorfismo é capacidade de um funcionario ser referenciado de várias formas");
		
		Funcionario funcionario = g;
		funcionario.setSalario(1000000);
		funcionario.descricao();
		System.out.println("Um exemplo que um objeto é referenciado de várias formas é : Funcionario f e Funcionario funcionario ambos são referencias para o objeto Gerente");
		
		
		

	}

}
