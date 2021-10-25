package br.com.geekuniversity.secao04;
//Operador ternário

public class Programa05 {
	public static void main(String[] args) {
		
		int numero, valor = -5;
		/*
		if(valor > 0) {
			numero = valor;
		}
		else {
			numero = 10;
		}
		*/
		
		//Usando o operador ternário:
		numero = (valor > 0) ? valor : 20;
		
		System.out.println(numero);
		
	}

}
