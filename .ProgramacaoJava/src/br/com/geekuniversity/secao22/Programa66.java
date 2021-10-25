package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 DEFAULT METHODS:
 - São métodos concretos, implementados em interfaces.
 - Não precisam ser implementados nas classes
 - Implementada a partir da versão 8 do Java
 - Atualmente, estamos na versão 14
 - 
 */
public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		//Imprime por tamanho(Usando o comparador)
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		System.out.println(palavras); //Vazio
		
		palavras.add("Geek");
		palavras.add("Toalha");
		palavras.add("Cadeira");
		palavras.add("Placa");
		palavras.add("Gel");
		palavras.add("Goiaba");
		palavras.add("Placa");
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
	}

}
