package br.com.geekuniversity.secao21;
/*
ARMAZENAMENTO SEQUENCIAL:
- 
-
 */
public class Programa55 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mariana");
		Aluno a2 = new Aluno("Priscila");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());	
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		try {
			System.out.println(lista.pega(101));
		}
		catch(IllegalArgumentException e) {
			System.out.println("O aluno da posição 101 não existe.");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		try {
			lista.adiciona(101, a3);
		}
		catch(IllegalArgumentException e) {
			System.out.println("A posição 101 é inválida.");
		}
		
		lista.remove(0);
		System.out.println(lista);		
	}
	

}
