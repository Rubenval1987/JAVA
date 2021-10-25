package br.com.geekuniversity.secao14;
/*
INTERFACES:
Uma interface pode conter:
- Constante
- M�todos abstratos

Interface de produtos eletr�nicos:
- Todo produto eletr�nico que implementar essa interface, 
deve implementar os m�todos abstratos
 */

public interface IEletronico {
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();
	
}
