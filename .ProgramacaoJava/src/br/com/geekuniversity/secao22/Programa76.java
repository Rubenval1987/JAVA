package br.com.geekuniversity.secao22;

/*
STREAMS:
- S�o fluxos de dados utulizados para usar os dados com mais crit�rio.
- OS m�todos usados em streams, n�o afetam a cole��o original
-
*/

import java.util.ArrayList;
import java.util.List;

public class Programa76 {

	public static void main(String[] args) {
List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o em Java", 170));
		cursos.add(new Curso("Programa��o em Phyton", 280));
		cursos.add(new Curso("Programa��o em C", 125));
		cursos.add(new Curso("Programa��o em C++", 0));
		cursos.add(new Curso("Programa��o em JavaScript", 0));
		cursos.add(new Curso("Programa��o em Cobol", 0));
		
		//Imprimindo apenas os cursos com mais de 100 alunos
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(System.out::println);
		
	}

}
