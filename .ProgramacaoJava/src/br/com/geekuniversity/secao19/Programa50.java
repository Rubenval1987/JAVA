package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

/*
MAPAS/MAP:
- S�o representados em Java pela interface map
- Mapeia seus elementos utilizando chave/valor
- S�o conhecidos por 3 cole��es:
  *Cole�ao de chaves
  *Cole��o de valores
  *Cole��o de associa��es
*/
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicia Nunes");
		pessoas.put(31, "Julieta Gomes");
		pessoas.put(41, "Maria Santos");
		
		//Cole��es de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Cole��es de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Cole��es de associa��es
		System.out.println("Associa��o: " + pessoas.entrySet());
	}

	
}
