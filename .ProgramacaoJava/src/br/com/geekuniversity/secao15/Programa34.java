package br.com.geekuniversity.secao15;
/*
ATRIBUTOS EST�TICOS:
- S�o atributos, onde os valores s�o compartilhados entre as
inst�ncias das classes.
- Para usar atributos est�ticos, colocamos colocamos o nome da
classe, junto ao atributo.
 */
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Jolie");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Alycia Silveston");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Roberto Carlos");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(Conta.contador);
	}

}
