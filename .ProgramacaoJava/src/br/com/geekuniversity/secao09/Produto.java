package br.com.geekuniversity.secao09;
/*CLASSES
  - O nome das classes inicia com letra mai�scula;
  - Nomeiam-se sem espa�o, sem acentua��o e sem caracteres especiais;
  - Na classe Java, n�o existe a fun��o main();
  - O nome da classe Java deve ser o mesmo nome do arquivo java;
  - Tudo que estiver dentro da chaves{}, faz parte da classe;
  - Toda classe java posssui a seguinte forma:
  - public class NomeDaClasse {}
 */


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


public class Produto {
	String nome;
	float preco;
	float desconto;			

	//M�todo para aumentar o pre�o do projeto;
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
				