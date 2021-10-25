package br.com.geekuniversity.secao12;
/* HERAN�A
 * Pessoa � a classe que vai ser herdada;
 * Tamb�m conhecida como:
 * - Classe m�e
 * - Classe pai
 * - Classe base
 * - Classe super
 * - Classe gen�rica
 */

public class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	
	public void setAnoNAscimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
		
	
}
