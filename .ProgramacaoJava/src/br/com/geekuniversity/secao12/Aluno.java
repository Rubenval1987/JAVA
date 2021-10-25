package br.com.geekuniversity.secao12;
/*HERAN�A
 * Vantagens da heran�a:
 * -Evita a repeti��o de c�digo;
 * -Facilita a manuten��o do programa;
 * -Quando uma classe herda de outra classe ela ganha todos os atributos 
 * e m�todos da classe herdada;
 * 
 * Conhecida como:
 * - Classe filha
 * - Classe espec�fica
 * - Classe dependente
 * - Sub-classe
 */
public class Aluno extends Pessoa{ //extends significa que Aluno � uma Pessoa.
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email); //super significa que Aluno est� herdando da classe superior(Pessoa)...
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
}
