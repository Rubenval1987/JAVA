package br.com.geekuniversity.secao06;
//Tipos alfanuméricos
//Caracteres e strings

public class Programa13 {
	public static void main(String[] args) {
		
		//Primitivos
		char letra1 = 'a'; //Aspas simples ('')
		char letra2 = 'z';
		char letra3 = 100; //100 vale 'd' me decimal
		
		//Não primitivos
		Character letra4 = 'A';
		String nome = " Linguagem java";
		
		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		System.out.println("Letra3 " + letra3);
		System.out.println("Letra4 " + letra4);
		System.out.println("Nome da String: " + nome);
		
		
		System.out.println("Tamanho da String: " + nome.length());
		System.out.println("Armazenamento da String: " + (Character.SIZE * nome.length()) + " bits");
		
	}

}
