package br.com.geekuniversity.secao11;

/*
Getter:
   -É um método público, que serve para consultar dados 
   -A nomenclatura desses métodos é getNomedoatributo()
*/

public class Conta {
	@SuppressWarnings("unused")
	private int numero;
	private float saldo;
	private float limite;
	@SuppressWarnings("unused")
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if(valor <= (this.saldo + this.limite)) {
			this.saldo = (this.saldo) - valor;
			System.out.println("Saque realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	/**
	 * Método para realizar depósito
	 * 
	 * @param valor a ser depositado
	 */
	
	public void depositar(float valor) {
		synchronized(this) {
			this.saldo = this.saldo + valor;
		}
	}
	
	/**
	 * 
	 * Método getter do atributo Saldo
	 * 
	 * @return a soma do saldo + limite
	 */
	
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}
		else {
			Conta verificar = (Conta) obj; //Cast
			return verificar.getSaldo() == this.getSaldo();
		}
	}
	
	
}
