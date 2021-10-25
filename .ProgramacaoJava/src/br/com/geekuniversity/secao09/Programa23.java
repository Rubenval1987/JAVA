package br.com.geekuniversity.secao09;


/*CONSTRUTOR
 * O construtor sempre tem o mesmo nome da classe;
 * Por padrão, a JVM cria um construtor padrão vazio ();
 * Podemos ter mais de um construtor na classe.
 */

public class Programa23 {
	public static void main(String[] args) {
		
		//Forma normal
		Pessoa pessoa1 = new Pessoa(); //Construtor
		pessoa1.nome = "Rubenval Mesquita";
		pessoa1.email = "rubenval@gmail.com";
		pessoa1.ano_nascimento = 1987;
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);
		System.out.println();
		
		
		
		
		
		//Forma resumida
		Pessoa pessoa2 = new Pessoa("Rubenval Mesquita", "rubenval@gmail.com", 1987); //Construtor
		
		pessoa2.imprime_informações();

	}
}
