package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
STREAM + THREAD = PARALELISMO
- Usado em quantidades enormes de dados
- N�o recomendado para quantidade pequenas
*/
public class Programa81 {

	public static void main(String[] args) {
List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o em Java", 170));
		cursos.add(new Curso("Programa��o em Phyton", 280));
		cursos.add(new Curso("Programa��o em C", 125));
		cursos.add(new Curso("Programa��o em C++", 0));
		cursos.add(new Curso("Programa��o em JavaScript", 0));
		cursos.add(new Curso("Programa��o em Cobol", 0));
		
		cursos.parallelStream() //Paralelismo
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos)-> System.out.println(nome + " tem " + alunos + " alunos"));
	}

}