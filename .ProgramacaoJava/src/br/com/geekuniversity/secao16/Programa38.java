package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int n2 = teclado.nextInt();
		
		try {
			System.out.println(divisao(n1, n2));
		}
		catch(ArithmeticException e) {
			System.out.println("N�o consegui dividir os valores.");
		}
		catch(Exception e) {
			System.out.println("Ocorrreu uma outra exce��o.");
		}
		
		teclado.close();
	}
	
	public static int divisao(int n1, int n2) throws Exception {
		return n1/n2;
	}

	
}
