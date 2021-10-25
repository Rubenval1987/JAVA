package br.com.geekuniversity.secao18;

/*
TRABALHANDO COM STRINGS:
- Strings em Java s�o imut�veis.
- Apenas retomam uma nova string.
- String � uma array(matriz) de caracteres
 */

public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programa��o em Java"; //String imut�vel
		System.out.println(curso); 
		
		curso = curso.replace("Java", "Python"); //Trocar� a primeira palavra, pela segunda
		System.out.println(curso);
		
		curso = curso.replace("a", "o"); //Trocar� a primeira letra, pela segunda
		System.out.println(curso);
		
		curso = curso.toLowerCase(); //Transforma tudas as letras em min�sculas
		System.out.println(curso);
		
		curso = curso.toUpperCase(); //Transforma tudas as letras em mai�sculas
		System.out.println(curso);
		
	}

	
}
