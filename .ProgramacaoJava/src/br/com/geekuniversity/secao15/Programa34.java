package br.com.geekuniversity.secao15;
/*
ATRIBUTOS ESTÁTICOS:
- São atributos, onde os valores são compartilhados entre as
instâncias das classes.
- Para usar atributos estáticos, colocamos colocamos o nome da
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
