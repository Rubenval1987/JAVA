package br.com.geekuniversity.secao11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente(35, "Joao da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente(22, "MAria das Neves", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1, 200.0f, 400.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 550.0f, maria);
		
		System.out.println("Antes do saque:");
		System.out.println("Saldo do João: " + conta_joao.getSaldo());
		System.out.println("Saldo de Maria: " + conta_maria.getSaldo());
		System.out.println();
		
		System.out.println("Depois do saque:");
		conta_joao.sacar(500);
		System.out.println("Saldo do João: " + conta_joao.getSaldo());
		conta_maria.sacar(500);
		System.out.println("Saldo de Maria: " + conta_maria.getSaldo());

	}

}
