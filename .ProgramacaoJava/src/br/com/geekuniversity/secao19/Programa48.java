package br.com.geekuniversity.secao19;

/*
CONJUNTOS:
- Os conjuntos s�o implementados com a interface Set.
- Umas das classes que implemtentam esta interface � a HashSet
- A maioria das cole��es possuem os m�todos j� conhecidos e usados 
com as listas, mas o comportamento desses objetos � um pouco diferente.
- A performance � melhor em conjuntos do que em listas.
- Conjuntos n�o aceitam repeti��o de itens.
- N�o aceita ordena��o dos itens.
- N�o possui �ndice.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i + 1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome n�o pode ser repetido. ");
				i--;
			}
		}
		
		System.out.println("NO conjunto nomes temos " + nomes.size() + " elementos. ");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}

	
}