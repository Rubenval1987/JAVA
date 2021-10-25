package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
OBJECT:
- A mãe de todas as classes
- Object faz parte do pacote java.lang
 */

public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18, "Edson Arantes", "Rua Santos, 123");
		Cliente cli2 = new Cliente(19, "Cristiano Ronaldo", "Rua Juventus, 456");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1.toString()); //Por padrão a instância imprime com toString()
		System.out.println(c2); //Pontanto, não é necessário colocal c2.toString()
		
		if(c1.equals(c2)) {
			System.out.println("São a mesma conta.");
		}
		
		else {
			System.out.println("São contas diferentes.");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast
		
		prateleira.adicionar(cli1);
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome()); //Cast
	}
	
}
