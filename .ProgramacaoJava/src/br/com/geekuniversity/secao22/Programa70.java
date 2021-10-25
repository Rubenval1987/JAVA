package br.com.geekuniversity.secao22;

/*
CLASSE ANÔNIMA
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa70 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("Toalha");
		palavras.add("Cadeira");
		palavras.add("Placa");
		palavras.add("Gel");
		palavras.add("Goiaba");
		palavras.add("Placa");
		
		palavras.sort(comparador);
		
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		});
		
	}

}
