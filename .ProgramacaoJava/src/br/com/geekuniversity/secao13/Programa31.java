package br.com.geekuniversity.secao13;
/*CLASSES ABSTRATAS:
 * 
 * Impossibilidade de cria��o de objetos dessa classe
 * Classes abstratas podem ter: atributos, m�todos e m�todos abstratos
 * 
 * M�todos abstratos:
 * - S�o m�todos que n�o possuem implementa��o
 * - Possuem apenas declara��o
 */
import br.com.geekuniversity.secao12.Pessoa;

public class Programa31 {

	public static void main(String[] args) {
		Pessoa maria = new Pessoa("Maria da Silva", 1999, "maria@gmail.com");
		System.out.println(maria);

	}

}
