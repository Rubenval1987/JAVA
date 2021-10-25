package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adiciona(Aluno aluno) { //Recebe um aluno
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total = total + 1;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = total - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i + 1];
			}
			total--;
		}
	
	public boolean contem(Aluno aluno) { //Descobre se o aluno está ou não na lista
		for(int i = 0; i < total; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() { //Devolve a quantidade de alunos no vetor
		return this.total;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(this.alunos); //Facilita a visualização do array
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
		if(total == alunos.length) {
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for(int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	
}
