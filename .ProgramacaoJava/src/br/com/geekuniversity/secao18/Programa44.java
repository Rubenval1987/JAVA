package br.com.geekuniversity.secao18;

/*
ESCRITA EM ARQUIVOS 2:
-
-
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("saida2.txt", true));
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();	
		}
		catch (FileNotFoundException e) {
			System.out.println("N�o foi poss�vel criar o arquivo.");
		}
		teclado.close();

	}

}
