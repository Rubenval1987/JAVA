package br.com.geekuniversity.secao19;

/*
LISTAS:
-
-
*/

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(56);
		numeros.add(11);
		numeros.add(20);
		numeros.add(49);
		numeros.add(64);
		numeros.add(35);
		numeros.add(77);
		
		System.out.println("Quantidade de nomes na lista: " + numeros.size());
		
		Collections.sort(numeros);
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));	
		}
	}

	
}
