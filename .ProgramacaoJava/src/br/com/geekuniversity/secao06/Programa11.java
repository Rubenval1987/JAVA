package br.com.geekuniversity.secao06;
//Tipos Numéricos (Inteiros)

public class Programa11 {
	public static void main(String[] args) {
		
		//Primários
		long num1 = 88888888;
		int num2 = 8888;
		short num3 = 88;
		byte num4 = 8;
		
		
		
		//Não primários
		Long num5 = (long) 7777777; //Foi realizado um "cast" para tornar Long = long
		Integer num6 = 7777;
		Short num7 = 77;
		Byte num8 = 7;
		
		System.out.println("long --> num1 = " + num1);
		System.out.println("int --> num2 = " + num2);
		System.out.println("short --> num3 = " + num3);
		System.out.println("byte --> num4 = " + num4);
		System.out.println("Long --> num5 = " + num5);
		System.out.println("Integer --> num6 = " + num6);
		System.out.println("Short --> num7 = " + num7);
		System.out.println("Byte --> num8 = " + num8);
		
		System.out.println("long/Long: " + Long.SIZE + "bits" );
		System.out.println("Int/Integer: " + Integer.SIZE + "bits" );
		System.out.println("short/Short: " + Short.SIZE + "bits" );
		System.out.println("byte/Byte: " + Byte.SIZE + "bits" );
		
		System.out.println("Valor Min long/Long: " + Long.MIN_VALUE);
		System.out.println("Valor Max long/Long: " + Long.MAX_VALUE);
		System.out.println("Valor Min int/Integer: " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor Min short/Short: " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short: " + Short.MAX_VALUE);
		System.out.println("Valor Min byte/Byte: " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte: " + Byte.MAX_VALUE);
		
		
		
		
	}

}
