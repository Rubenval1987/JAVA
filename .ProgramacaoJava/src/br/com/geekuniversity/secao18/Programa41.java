package br.com.geekuniversity.secao18;

/*
TRABALHANDO COM STRINGS:
- Strings em Java são imutáveis.
- Apenas retomam uma nova string.
- String é uma array(matriz) de caracteres
 */

public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programação em Java"; //String imutável
		System.out.println(curso); 
		
		curso = curso.replace("Java", "Python"); //Trocará a primeira palavra, pela segunda
		System.out.println(curso);
		
		curso = curso.replace("a", "o"); //Trocará a primeira letra, pela segunda
		System.out.println(curso);
		
		curso = curso.toLowerCase(); //Transforma tudas as letras em minúsculas
		System.out.println(curso);
		
		curso = curso.toUpperCase(); //Transforma tudas as letras em maiúsculas
		System.out.println(curso);
		
	}

	
}
