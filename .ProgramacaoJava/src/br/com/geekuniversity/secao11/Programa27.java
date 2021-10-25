package br.com.geekuniversity.secao11;
/*PRIVATE
 * Privado a pr�pria classe.
 * S� temos acesso ao m�todo/atributo privado, dentro da pr�pria classe
 * onde foi declarado.
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(52, "Angelina Jolie", "Rua qualquer, 256");
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endere�o: " + cli1.getEndereco());
		cli1.dizer_oi();
		System.out.println();
		
		Cliente cli2 = new Cliente(65, "Mike Tyson", "Rua qualquer, 300");
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endere�o: " + cli2.getEndereco());
		cli2.dizer_oi();
	}

}
