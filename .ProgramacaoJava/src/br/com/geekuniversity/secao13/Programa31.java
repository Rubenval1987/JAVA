package br.com.geekuniversity.secao13;
/*CLASSES ABSTRATAS:
 * 
 * Impossibilidade de criação de objetos dessa classe
 * Classes abstratas podem ter: atributos, métodos e métodos abstratos
 * 
 * Métodos abstratos:
 * - São métodos que não possuem implementação
 * - Possuem apenas declaração
 */
import br.com.geekuniversity.secao12.Pessoa;

public class Programa31 {

	public static void main(String[] args) {
		Pessoa maria = new Pessoa("Maria da Silva", 1999, "maria@gmail.com");
		System.out.println(maria);

	}

}
