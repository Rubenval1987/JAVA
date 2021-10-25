package br.com.geekuniversity.secao20;

/*
THREAD SINCRONIZADA
- Estável
- Durante a execução do método thread, é realizado um look(bloqueio) da função.
- Os outros threads só podem ser realizados, depois de executado o thread inicial.
*/

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 = 600?
		t2.start(); //600 + 100 = 700?
		
		t1.join(); //Faz com que a thread t1 se junte a um sincronizador
		t1.join(); //Faz com que a thread t2 se junte a um sincronizador
		
		System.out.println(c1);
		
	}

}
