package br.com.geekuniversity.secao07;
//Vetores(Arrays)-II

public class Programa17 {
	public static void main(String[] args) {
		
		int numero[] = new int[10];
		System.out.println("Tamanho do vetor: " + numero.length);
		
		
		
		
		//Vetores incrementados/devrementados
		for(int i = 0; i < numero.length; i++) {
			numero[i] = i + 3;
		}
		System.out.println("Primeiro elemento: " + numero[0]); //Primeiro elemento do vetor
		System.out.println("Último elemento: " + numero[9]); //Último elemento do vetor
		
		
		
		
		//Vetores gerando resultados aleatórios
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int)Math.round(Math.random() * 10);
		}
		System.out.println("Primeiro elemento: " + numero[0]); //Primeiro elemento do vetor
		System.out.println("Último elemento: " + numero[9]); //Último elemento do vetor
		
		System.out.println(Math.random()); //Números aleatório entre (0 e 1)
		System.out.println(Math.random() * 10); //Números aleatório entre (0 e 1)*10
		System.out.println(Math.round(Math.random() * 10)); //Números aleatório entre (0 e 1)*10 [arredondado]
	}
}
