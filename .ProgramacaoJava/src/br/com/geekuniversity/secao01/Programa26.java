package br.com.geekuniversity.secao01;

/*P�BLICO
 * Pode ser usado em todo o programa
 * Torna os pacotes acess�ves para serem usados em todo o projeto
*/

import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente(33, "Angelina Jolie", "Rua da barra, 256");
		
		//System.out.println("Nome: " + cli.nome); (Agora ficaram privados)
		//System.out.println("Endere�o: " + cli.endereco); (Agora s�o privados)
		
		//cli.dizer_oi(); 
		
		System.out.println(cli.hashCode());
	}

}
