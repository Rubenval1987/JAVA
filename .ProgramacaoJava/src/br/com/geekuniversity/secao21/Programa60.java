package br.com.geekuniversity.secao21;

/*
PILHAS:
- São elementos de dados em que o elemento visível, sempre será o do topo.
- OS elementos adicionados em pilha, sempre são colocados no topo.																																																																																																																																																																							
- Para remover elementos da pilha, só podemos remover o topo.
- Todo elemento é adicionado ao início da fila.
- O primeiro elemento a entrar é o último a sair.
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
