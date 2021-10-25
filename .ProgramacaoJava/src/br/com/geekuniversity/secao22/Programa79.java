package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o em Java", 170));
		cursos.add(new Curso("Programa��o em Phyton", 280));
		cursos.add(new Curso("Programa��o em C", 125));
		cursos.add(new Curso("Programa��o em C++", 0));
		cursos.add(new Curso("Programa��o em JavaScript", 0));
		cursos.add(new Curso("Programa��o em Cobol", 0));
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny() //Pega qualquer um de acordo com o filtro
		.ifPresent(System.out::println); //Se encontrar algum curso, imprime
	}

}
