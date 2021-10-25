package br.com.geekuniversity.secao08;
//Funções-I

import java.util.Scanner;

public class Programa20 {
	
	static String frutas[]; //Váriaveis global
	static Scanner teclado = new Scanner(System.in); //Variável global
	
	public static void main(String[] args) {
		int qtd; //Variável local
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd); //Chamando a primeira função
		mostrar_dados(qtd);  //Chamando a segunda função
		
		teclado.close();
		
	}
	
	static void cadastrar_dados(int quantidade) { //Primeira função
		frutas = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe a " + (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) { //Segunda função
		for(int i = 0; i < quantidade; i++) {
			System.out.println(frutas[i]);	
		}
	}
}
