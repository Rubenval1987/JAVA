package br.com.geekuniversity.secao22;

/*
FOREACH
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("Toalha");
		palavras.add("Cadeira");
		palavras.add("Placa");
		palavras.add("Gel");
		palavras.add("Goiaba");
		palavras.add("Placa");
		
		palavras.forEach(consumidor);
	}

}
