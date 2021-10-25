package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("Toalha");
		palavras.add("Cadeira");
		palavras.add("Placa");
		palavras.add("Gel");
		palavras.add("Goiaba");
		palavras.add("Placa");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
		
		

	}

}
