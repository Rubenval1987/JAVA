package br.com.geekuniversity.secao12;
/*HERANÇA
 * Vantagens da herança:
 * -Evita a repetição de código;
 * -Facilita a manutenção do programa;
 * -Quando uma classe herda de outra classe ela ganha todos os atributos 
 * e métodos da classe herdada;
 * 
 * Conhecida como:
 * - Classe filha
 * - Classe específica
 * - Classe dependente
 * - Sub-classe
 */
public class Aluno extends Pessoa{ //extends significa que Aluno é uma Pessoa.
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email); //super significa que Aluno está herdando da classe superior(Pessoa)...
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
}
