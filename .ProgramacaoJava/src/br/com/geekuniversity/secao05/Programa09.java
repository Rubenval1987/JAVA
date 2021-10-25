package br.com.geekuniversity.secao05;
//For e foreach

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		//Variável de controle; Condição de parada; Forma de incremento
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos ");
			}
		}
		
		teclado.close();

	}

}
