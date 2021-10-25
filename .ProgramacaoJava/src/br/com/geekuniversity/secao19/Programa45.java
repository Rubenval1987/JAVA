package br.com.geekuniversity.secao19;

/*
LISTAS:
- Java posui diversas classes que facilitam muito o trabalho em se tratando de coleções de dados.
- Essas classes são chamadas de coleções.
- Aceitam repetição de valores.
- Possuem tamanho infinito.
- Podemos adicionar objetos de qualquer valor ou tipo.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Programa45 {

	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		
		nomes.add("Maria");
		nomes.add("Paulo");
		nomes.add("Ana");
		nomes.add("Marinho");
		nomes.add("Roberto");
		nomes.add("Lívia");
		nomes.add("Humberto");
		
		
		System.out.println("Quantidade de nomes na lista: " + nomes.size());
		
		Collections.sort(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));	
		}
		
	}

	
}
