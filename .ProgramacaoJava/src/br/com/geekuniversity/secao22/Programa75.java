package br.com.geekuniversity.secao22;

/*
REVIS�O:
- Classes an�nimas
- L�mbdas
- Method references
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa75 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o em Java", 170));
		cursos.add(new Curso("Programa��o em Phyton", 280));
		cursos.add(new Curso("Programa��o em C", 125));
		cursos.add(new Curso("Programa��o em C++", 0));
		cursos.add(new Curso("Programa��o em JavaScript", 0));
		cursos.add(new Curso("Programa��o em Cobol", 0));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method references
		
		cursos.forEach(System.out::println); //Method references
	}

}
