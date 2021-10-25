package br.com.geekuniversity.secao06;
//Operações matemáticas

public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 12;
		int res1;
		float res2;
		
		//Soma
		res1 = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é igual a " + res1);
		
		//Subtração
		res1 = num1 - num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " é igual a " + res1);
		
		//Multiplicação
		res1 = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é igual a " + res1);
		
		//Divisão inteira
		res1 = num2 / num1;
		System.out.println("A divisão inteira de " + num2 + " / " + num1 + " é igual a " + res1);
		
		//Divisão real
		res2 = (float)num2 / (float)num1; //Cast
		System.out.println("A divisão real de " + num2 + " / " + num1 + " é igual a " + res2);
		
		//Módulo
		res1 = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + " por 2 é igual a " + res1);
		
		res1 = num2 % 2;
		System.out.println("O resto da divisão de " + num2 + " por 2 é igual a " + res1);
	}

}
