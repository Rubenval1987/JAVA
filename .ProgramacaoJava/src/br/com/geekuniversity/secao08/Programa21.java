package br.com.geekuniversity.secao08;
//Funções-II

public class Programa21 {
	public static void main(String[] args) {
		int valor1 = 4, valor2 = 6;
		
		System.out.println("O resultado é " + soma(valor1, valor2)); //Chamando a primeira função
		
		System.out.println(mensagem()); //Chamando a segunda função
	}

	
	static int soma(int v1, int v2) { //Primeira função
		return v1 + v2;
	}
	
	
	static String mensagem() { //Segunda função
		return "Olá cliente!";
	}
	
	
}
