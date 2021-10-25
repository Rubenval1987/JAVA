package br.com.geekuniversity.secao20;

/*
- Para execurar m�todos em paralelo, usamos a interface "Runnable"
- O m�todo a ser executado, precisa ser dentro de "run"
 */

public class GeraRelatorio implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <1000; i++) {
			System.out.println(i + " Gerando relat�rio...aguarde");
		}
	}	
}
