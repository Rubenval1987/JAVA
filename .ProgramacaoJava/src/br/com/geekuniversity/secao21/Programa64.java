package br.com.geekuniversity.secao21;

import java.util.LinkedList;

/*
CONJUNTOS:
- Não aceitam elementos repetidos
- Geram performance
-
*/

public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); //Não entra repetido
		System.out.println(conjunto);
		
		conjunto.remove("Juvenal");
		System.out.println(conjunto);
	}

	
}
