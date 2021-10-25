package br.com.geekuniversity.secao14;

/* INTERFACES:
 - S�o conhecidas como contrato
 - Possuem constantes e m�todos abstratos
 */

public class Programa33 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador � " + vent.MARCA + "\n");
		
		vent.desligar(); //N�o imprime mensagem, pois ventilador, por padr�o fica desligado
		
		vent.ligar(); //Deve imprimir mensagem
		
		vent.desligar(); //Deve imprimir mensagem
	}

}
