package br.com.geekuniversity.secao17;

/*
GERENDO EXACUT�VEIS COM JAR:
- JAR (Java Archive)
- Sempre em arquivo compactado
- zip/rar
 */

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Principal {
	static Cliente cliente = new Cliente(20, "Angelina Jolie", "Rua da paz, 45");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner teclado = new Scanner(System.in);

	public static void depositar() {
		System.out.println("============== DEP�SITO =============");
		System.out.println("Informe o valor para dep�sito: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Dep�sito efetuado com sucesso.");
		}
		else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void sacar() {
		System.out.println("============== SAQUE =============");
		System.out.println("Informe o valor para saque: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.sacar(valor);
		}
		else {
			System.out.println("O valor precisa ser positivo.");
		}
	}
	public static void consultar() {
			System.out.println("Seu saldo � " + conta.getSaldo());
	}
	
	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("Bem-vindo ao banco Geek");
		
		do {
			System.out.println("Selecione uma op��o: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
		while(opcao > 0);
		teclado.close();
	}
	
	
}
