package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

/*
MAPAS/MAP:
- São representados em Java pela interface map
- Mapeia seus elementos utilizando chave/valor
- São conhecidos por 3 coleções:
  *Coleçao de chaves
  *Coleção de valores
  *Coleção de associações
*/
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicia Nunes");
		pessoas.put(31, "Julieta Gomes");
		pessoas.put(41, "Maria Santos");
		
		//Coleções de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Coleções de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Coleções de associações
		System.out.println("Associação: " + pessoas.entrySet());
	}

	
}
