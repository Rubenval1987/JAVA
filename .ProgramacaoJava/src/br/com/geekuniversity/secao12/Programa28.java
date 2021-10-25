package br.com.geekuniversity.secao12;
//HERANÇA

public class Programa28 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro da Silva", 1987, "pedro@outlook.com");
		System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Vanessa da Silva", 2000, "vanessa@outlook.com", "123456");
		System.out.println(a1.getNome());
		
		Professor prof1 = new Professor("Augusto da Silva", 1970, "augusto@outlook.com", "ABC123");
		System.out.println(prof1.getNome());

	}

}
