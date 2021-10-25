package br.com.geekuniversity.secao09;
/*CLASSES
  - O nome das classes inicia com letra maiúscula;
  - Nomeiam-se sem espaço, sem acentuação e sem caracteres especiais;
  - Na classe Java, não existe a função main();
  - O nome da classe Java deve ser o mesmo nome do arquivo java;
  - Tudo que estiver dentro da chaves{}, faz parte da classe;
  - Toda classe java posssui a seguinte forma:
  - public class NomeDaClasse {}
 */


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


public class Produto {
	String nome;
	float preco;
	float desconto;			

	//Método para aumentar o preço do projeto;
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
				