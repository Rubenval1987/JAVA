package br.com.geekuniversity.secao09;


/* ATRIBUTOS
 * O nome dos atributos são todos em minúsculo;
 * São as características da classe/molde/modelo de dados;
 * São considerados como variáveis da classe;
 * São nomeados sem espaços, sem caracteres especiais e sem acentuação;
 */

/*MÉTODOS
 * São as ações que serão realizadas por um objeto da classe;
 * São os comprotamentos dos objetos das classes;
 * Possem os mesmos requisitos das funções;
 * O nome deve corresponder a ação que a função dever realizar
 */

public class Pessoa {
	String nome;
	String email;
	int ano_nascimento;
	
	//Método construtor vazio
	public Pessoa() {}
	
	//Método construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		//this == este objeto	
	}
	
	void imprime_informações() { //Informações que serão usadas em em "pessoa2"
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
	}
}
