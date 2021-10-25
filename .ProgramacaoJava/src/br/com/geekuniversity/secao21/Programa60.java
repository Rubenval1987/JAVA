package br.com.geekuniversity.secao21;

/*
PILHAS:
- S�o elementos de dados em que o elemento vis�vel, sempre ser� o do topo.
- OS elementos adicionados em pilha, sempre s�o colocados no topo.																																																																																																																																																																							
- Para remover elementos da pilha, s� podemos remover o topo.
- Todo elemento � adicionado ao in�cio da fila.
- O primeiro elemento a entrar � o �ltimo a sair.
*/

public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		pilha.insere("Felicity");
																																																																																																																																																																																																																																																																																																																							
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());
	}
	
	
}
