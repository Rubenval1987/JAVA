package br.com.geekuniversity.secao19;

/*
CONJUNTOS:
- Os conjuntos são implementados com a interface Set.
- Umas das classes que implemtentam esta interface é a HashSet
- A maioria das coleções possuem os métodos já conhecidos e usados 
com as listas, mas o comportamento desses objetos é um pouco diferente.
- A performance é melhor em conjuntos do que em listas.
- Conjuntos não aceitam repetição de itens.
- Não aceita ordenação dos itens.
- Não possui índice.
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
				System.out.println("O nome não pode ser repetido. ");
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