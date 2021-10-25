package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String nome) {
		if(!contem(nome)) { //Verifica se o nome n�o existe na lista
			int indice = calculaIndice(nome); //Calculando o �ndice do nome
			List<String> lista = tabela.get(indice); //Pegando a lista de acordo com o �ndice
			lista.add(nome); //Adiciona o nome na lista correta
		}
	}
	
	private boolean contem(String nome) {
		int indice = calculaIndice(nome); //Calculando o �ndice do nome
		return tabela.get(indice).contains(nome); //Buscamos na tebela espec�fica do �ndice nome
	}
	
	public void remove(String nome) {
		if(contem(nome)) { //Verificando se o nome existe em alguma lista
			int indice = calculaIndice(nome); //Calculando o �ndice do nome
			List<String> lista = tabela.get(indice); //Pegando a lista de acordo com o �ndice
			lista.remove(nome); //Removemos o nome da lista
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}

	
}
