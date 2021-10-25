package br.com.geekuniversity.secao14;

/* INTERFACES:
 - São conhecidas como contrato
 - Possuem constantes e métodos abstratos
 */

public class Programa33 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é " + vent.MARCA + "\n");
		
		vent.desligar(); //Não imprime mensagem, pois ventilador, por padrão fica desligado
		
		vent.ligar(); //Deve imprimir mensagem
		
		vent.desligar(); //Deve imprimir mensagem
	}

}
