package br.com.geekuniversity.secao19;

/*
LISTAS:
-
-
*/

import java.util.ArrayList;
import java.util.Collections;

import br.com.geekuniversity.secao11.Cliente;

public class Programa47 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente (18, "Paulo Ricardo", "Rua 1");
		Cliente cli2 = new Cliente (30, "Sandra Lima", "Rua 2");
		Cliente cli3 = new Cliente (20, "Maria Santos", "Rua 3");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		System.out.println("Quantidade de nomes na lista: " + clientes.size());
		
		Collections.sort(clientes);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}

	}

	
}
