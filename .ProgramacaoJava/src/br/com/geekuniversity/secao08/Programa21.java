package br.com.geekuniversity.secao08;
//Fun��es-II

public class Programa21 {
	public static void main(String[] args) {
		int valor1 = 4, valor2 = 6;
		
		System.out.println("O resultado � " + soma(valor1, valor2)); //Chamando a primeira fun��o
		
		System.out.println(mensagem()); //Chamando a segunda fun��o
	}

	
	static int soma(int v1, int v2) { //Primeira fun��o
		return v1 + v2;
	}
	
	
	static String mensagem() { //Segunda fun��o
		return "Ol� cliente!";
	}
	
	
}
