package br.com.geekuniversity.secao22;

/*
STREAMS:
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa80 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação em Java", 170));
		cursos.add(new Curso("Programação em Phyton", 280));
		cursos.add(new Curso("Programação em C", 125));
		cursos.add(new Curso("Programação em C++", 0));
		cursos.add(new Curso("Programação em JavaScript", 0));
		cursos.add(new Curso("Programação em Cobol", 0));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos)-> System.out.println(nome + " tem " + alunos + " alunos"));					
	}

}
