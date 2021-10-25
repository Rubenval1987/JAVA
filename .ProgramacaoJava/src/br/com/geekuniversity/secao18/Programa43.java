package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
LEITURA EM ARQUIVOS:
-
-
*/

public class Programa43 {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(new FileInputStream("entrada.txt"));
			
			while(ler.hasNextLine()) {
				String Linha = ler.nextLine();
				System.out.println(Linha);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado.");
		}
	}

}
