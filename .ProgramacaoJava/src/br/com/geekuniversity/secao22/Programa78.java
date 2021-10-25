package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa78 {

	public static void main(String[] args) {
List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o em Java", 170));
		cursos.add(new Curso("Programa��o em Phyton", 280));
		cursos.add(new Curso("Programa��o em C", 125));
		cursos.add(new Curso("Programa��o em C++", 0));
		cursos.add(new Curso("Programa��o em JavaScript", 0));
		cursos.add(new Curso("Programa��o em Cobol", 0));
		
		int soma = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos) //Fazer c�lculos com o resultado
		.sum();
		System.out.println("A soma dos cursos com alunos com mais de 100 alunos �: " + soma);
	}

}
