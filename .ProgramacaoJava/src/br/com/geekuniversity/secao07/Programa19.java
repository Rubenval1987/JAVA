package br.com.geekuniversity.secao07;
//Matrizes - II

public class Programa19 {
	public static void main(String[] args) {
		int numero[][] = new int[3][3];
		numero[0][0] = 1;
		numero[0][1] = 3;
		numero[0][2] = 5;
		numero[1][0] = 7;
		numero[1][1] = 9;
		numero[1][2] = 11;
		numero[2][0] = 13;
		numero[2][1] = 15;
		numero[2][2] = 17;
		
		for(int i = 0; i < numero.length; i++) {
			for(int j = 0; j < numero[i].length; j++) {
				System.out.println("numero[" + i + "]" + "[" + j + "]" + " = " + numero[i][j]);
				
			}
		}
		
		
	}
}
