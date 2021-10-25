package br.com.geekuniversity.secao15;

/*
 M�TODOS EST�TICOS:
 - N�o depende de uma inst�ncia da classe para ser utilizado.
 - Usa-se como: NomeDaClasse.metodo();
 */

public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu cliente");
		System.out.println("N�mero da conta: " + c1.getNumero());
		System.out.println("Nome do cliente: " + c1.getCliente());
		
		System.out.println("A pr�xima conta ser�: " + Conta.proximaConta());
	}

}
