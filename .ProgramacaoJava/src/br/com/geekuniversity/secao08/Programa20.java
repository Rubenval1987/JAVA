package br.com.geekuniversity.secao08;
//Fun��es-I

import java.util.Scanner;

public class Programa20 {
	
	static String frutas[]; //V�riaveis global
	static Scanner teclado = new Scanner(System.in); //Vari�vel global
	
	public static void main(String[] args) {
		int qtd; //Vari�vel local
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd); //Chamando a primeira fun��o
		mostrar_dados(qtd);  //Chamando a segunda fun��o
		
		teclado.close();
		
	}
	
	static void cadastrar_dados(int quantidade) { //Primeira fun��o
		frutas = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe a " + (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) { //Segunda fun��o
		for(int i = 0; i < quantidade; i++) {
			System.out.println(frutas[i]);	
		}
	}
}
