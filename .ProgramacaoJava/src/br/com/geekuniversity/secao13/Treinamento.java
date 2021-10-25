package br.com.geekuniversity.secao13;

public abstract class Treinamento {
	
	//Template Method
	public final void TreinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
//final é um modificador de acesso que faz com que o elemento
//que esteja utilizando, não possa ser extendido
	
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático...");
	}

	
}
