package br.com.geekuniversity.secao16;

/*
 TRATANDO EXCEÇÕES:
 -Try: usado para realizar aquilo que pode resultar em algum problema.
 
 -Catch: usado para capturar o erro e com isso oferecer ao usuário uma
 mensaem adequada sem que o sistea quebre.
 */

public class Programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		for(int i = 0; i <= numeros.length; i++) {
			
			try {
				System.out.println(numeros[i]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição inexistente.");		
			}
			
		}
		
	}

	
}
