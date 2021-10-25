package br.com.geekuniversity.secao20;

/*
THREADS:
- Por padrão as threads não são sincronizadas
- Popde ocorrer de um thred acessar um valor não atualizado
- Não são instáveis
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
