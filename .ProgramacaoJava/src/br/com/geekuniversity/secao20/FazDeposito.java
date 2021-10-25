package br.com.geekuniversity.secao20;

/*
THREADS:
- Por padr�o as threads n�o s�o sincronizadas
- Popde ocorrer de um thred acessar um valor n�o atualizado
- N�o s�o inst�veis
*/

import br.com.geekuniversity.secao11.Conta;

public class FazDeposito implements Runnable { 
	private Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
	}

}
