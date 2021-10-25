package br.com.geekuniversity.secao22;
/*
LÂMBDAS:
- Expressões lâmbdas são funções anônimas
- Funções sem nome
- Atalho para identação(Organização) do código = Ctrl + Shift + f
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

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
		
		palavras.forEach(s -> System.out.println(s)); //Usando Lâmbdas
	}

}
