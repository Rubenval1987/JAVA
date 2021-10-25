package br.com.geekuniversity.secao19;

/*
HASHMAP:
- Essa classe implementa a interface Map.
- Trabalha com chave/valor
- N�o aceita chaves duplicadas 
- 
*/

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(24, "Roberto Carlos", "Rua 1");
		Cliente cli2 = new Cliente(30, "Carlos Maia", "Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 700, cli2);
		
		contas.put("Pessoa F�sica", c1);
		contas.put("Pessoa Jur�dica", c2);
		contas.put("Pessoa F�sica", c1);
		
		System.out.println(contas.size()); //N�o imprime o valor repetido
		
		System.out.println(contas.get("Pessoa F�sica"));
		System.out.println(contas.get("Pessoa Jur�dica"));
	}

	
}
