package br.com.geekuniversity.secao06;
//Opera��es matem�ticas

public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 12;
		int res1;
		float res2;
		
		//Soma
		res1 = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " � igual a " + res1);
		
		//Subtra��o
		res1 = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " - " + num2 + " � igual a " + res1);
		
		//Multiplica��o
		res1 = num1 * num2;
		System.out.println("A multiplica��o de " + num1 + " * " + num2 + " � igual a " + res1);
		
		//Divis�o inteira
		res1 = num2 / num1;
		System.out.println("A divis�o inteira de " + num2 + " / " + num1 + " � igual a " + res1);
		
		//Divis�o real
		res2 = (float)num2 / (float)num1; //Cast
		System.out.println("A divis�o real de " + num2 + " / " + num1 + " � igual a " + res2);
		
		//M�dulo
		res1 = num1 % 2;
		System.out.println("O resto da divis�o de " + num1 + " por 2 � igual a " + res1);
		
		res1 = num2 % 2;
		System.out.println("O resto da divis�o de " + num2 + " por 2 � igual a " + res1);
	}

}
