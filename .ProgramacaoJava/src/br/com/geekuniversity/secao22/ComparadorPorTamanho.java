package br.com.geekuniversity.secao22;

import java.util.Comparator;

/*
- Criando nosso pr�prio comparador de objetos(Strings), para poder
ordenar por tamanho, ao inv�s de pela ordem alfab�tica.
- 
-
 */
public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		//String1 � menor que String2, retornamos -1
		if(s1.length() < s2.length()) {
			return -1;
		}
		
		//String1 � maior que String2, retornamos 1
		if(s1.length() > s2.length()) {
			return 1;
		}
		
		//String1 � igual a String2, retornamos 0
		return 0;
	}

}
