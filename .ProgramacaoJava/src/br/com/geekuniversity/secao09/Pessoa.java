package br.com.geekuniversity.secao09;


/* ATRIBUTOS
 * O nome dos atributos s�o todos em min�sculo;
 * S�o as caracter�sticas da classe/molde/modelo de dados;
 * S�o considerados como vari�veis da classe;
 * S�o nomeados sem espa�os, sem caracteres especiais e sem acentua��o;
 */

/*M�TODOS
 * S�o as a��es que ser�o realizadas por um objeto da classe;
 * S�o os comprotamentos dos objetos das classes;
 * Possem os mesmos requisitos das fun��es;
 * O nome deve corresponder a a��o que a fun��o dever realizar
 */

public class Pessoa {
	String nome;
	String email;
	int ano_nascimento;
	
	//M�todo construtor vazio
	public Pessoa() {}
	
	//M�todo construtor com par�metros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		//this == este objeto	
	}
	
	void imprime_informa��es() { //Informa��es que ser�o usadas em em "pessoa2"
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
	}
}
