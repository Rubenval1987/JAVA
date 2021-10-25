package br.com.geekuniversity.secao22;

import java.util.Comparator;

/*
- Criando nosso próprio comparador de objetos(Strings), para poder
ordenar por tamanho, ao invés de pela ordem alfabética.
- 
-
 */
public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		//String1 é menor que String2, retornamos -1
		if(s1.length() < s2.length()) {
			return -1;
		}
		
		//String1 é maior que String2, retornamos 1
		if(s1.length() > s2.length()) {
			return 1;
		}
		
		//String1 é igual a String2, retornamos 0
		return 0;
	}

}
