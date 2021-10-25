package br.com.geekuniversity.secao22;

/*
REVISÂO:
- Classes anônimas
- Lâmbdas
- Method references
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa75 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação em Java", 170));
		cursos.add(new Curso("Programação em Phyton", 280));
		cursos.add(new Curso("Programação em C", 125));
		cursos.add(new Curso("Programação em C++", 0));
		cursos.add(new Curso("Programação em JavaScript", 0));
		cursos.add(new Curso("Programação em Cobol", 0));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method references
		
		cursos.forEach(System.out::println); //Method references
	}

}
