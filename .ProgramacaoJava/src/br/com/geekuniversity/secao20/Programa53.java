package br.com.geekuniversity.secao20;

/*
THREAD NÃO SINCRONIZADA
- Não é estável
- 
*/

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 = 600?
		t2.start(); //600 + 100 = 700?
		
		System.out.println(c1);

	}

}
