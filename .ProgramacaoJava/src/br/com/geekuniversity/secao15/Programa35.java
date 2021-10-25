package br.com.geekuniversity.secao15;

/*
 MÉTODOS ESTÁTICOS:
 - Não depende de uma instância da classe para ser utilizado.
 - Usa-se como: NomeDaClasse.metodo();
 */

public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu cliente");
		System.out.println("Número da conta: " + c1.getNumero());
		System.out.println("Nome do cliente: " + c1.getCliente());
		
		System.out.println("A próxima conta será: " + Conta.proximaConta());
	}

}
