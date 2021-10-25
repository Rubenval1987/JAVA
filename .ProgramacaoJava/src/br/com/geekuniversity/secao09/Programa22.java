package br.com.geekuniversity.secao09;


/*OBJETOS
 * São produtos das classes;
 * Instanciação é o mesmo que criar produtos;
 */

public class Programa22 {
	public static void main(String[] args) {
		
		//Declaração e inicialização/instancialização de um objeto
		Produto p1 = new Produto();//Construtor
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		Produto p2 = new Produto(); //Construtor
		p2.nome = "Caneta bic";
		p2.preco = 2.45f;
		p2.desconto = 5;
		
		System.out.println("================ Produtos ====================");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + "%");
		System.out.println();
		
		System.out.println(p2.nome);
		System.out.println("R$ " + p2.preco);
		System.out.println(p2.desconto + "%");
		System.out.println("\n");
		
		
		Pessoa pessoa1 = new Pessoa(); //Construtor
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;
		
		System.out.println("================ Pessoas =====================");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);
	
	}

}
