package br.com.geekuniversity.secao21;

/*
LISTA LIGADA(LINKEDLIST):
- Em vetores, os elementos ficam um ao lado do outro. Já em lista, ligados.
- Os elementos ficam fora de ordem
- Cada elemento aponta para o próximo elemento da lista, mesmo fora de ordem.
*/

import br.com.geekuniversity.secao11.Cliente;

public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		/*
		System.out.println(lista);
		lista.adicionarNoComeco("Maria");
		System.out.println(lista);
		
		lista.adicionarNoComeco("Angelina");
		System.out.println(lista);
		
		lista.adicionarNoComeco("Felicity");
		System.out.println(lista);
		
		String nome = "Pedro";
		lista.adicionarNoComeco(nome);
		System.out.println(lista);
		
		int numero = 42;
		lista.adicionarNoComeco(numero);
		System.out.println(lista);
		
		Cliente cli1 = new Cliente(34, "Juliana Ambrósio", "Rua 3");
		lista.adicionarNoComeco(cli1);
		System.out.println(lista);
		*/
		
		/*
		System.out.println(lista);
		
		lista.adiciona("Angela");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adicionarNoComeco("Felicity");
		System.out.println(lista);
		
		lista.adiciona(1, "Pelé");
		System.out.println(lista);
		
		Object ret = lista.pega(1);
		System.out.println(ret);
		
		System.out.println(lista.tamanho());
		*/
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		lista.adiciona("Felicity");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
	}

	
}
