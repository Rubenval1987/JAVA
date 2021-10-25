package br.com.geekuniversity.secao13;

/*
 TEMPLATE METHOD:
 - Define o esqueleto de um algoritmo dentro de um método
 - Transfere alguns passos para as subclasses
 - Permite que as subclasses alterem parte do algoritmo, sem alterar a estrura 
 - Algoritmos são "receitas" passo-a-passo de como resolver um problema
 */

public class Programa32 {

	public static void main(String[] args) {
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.TreinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.TreinoDiario();
		
	}

}
