package br.com.geekuniversity.secao22;
/*
L�MBDAS:
- Express�es l�mbdas s�o fun��es an�nimas
- Fun��es sem nome
- Atalho para identa��o(Organiza��o) do c�digo = Ctrl + Shift + f
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
		
		palavras.forEach(s -> System.out.println(s)); //Usando L�mbdas
	}

}
