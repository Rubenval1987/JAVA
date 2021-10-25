package br.com.geekuniversity.secao14;
/*
INTERFACES:
Uma interface pode conter:
- Constante
- Métodos abstratos

Interface de produtos eletrônicos:
- Todo produto eletrônico que implementar essa interface, 
deve implementar os métodos abstratos
 */

public interface IEletronico {
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();
	
}
