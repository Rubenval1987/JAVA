package br.com.geekuniversity.secao22;
/*
CLASSES ANÔNIMAS:
- São classes sem nome
- Usadas quando temos interfaces com poucos métodos e não presisamos reaproveitar o código da classe.
- 
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa69 {

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
		
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}	
		};
		
		palavras.forEach(consumidor);

	}

}
