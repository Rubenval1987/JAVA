package br.com.geekuniversity.secao06;
//Tipos Numéricos (Reais)

public class Programa12 {
	public static void main(String[] args) {
		
		//Primários
		double preco1 = 37.595959595959595959;
		float preco2 = 37.59f;
		
		
		
		//Não primários
		Double preco3 = 45.5014522369701256;
		Float preco4 = 45.58f;
		
		System.out.println("double --> preco1 = " + preco1);
		System.out.println("float --> preco2 = " + preco2);
		System.out.println("Double --> preco3 = " + preco3);
		System.out.println("Float --> preco4 = " + preco4);
		
		System.out.println("double/Double: " + Double.SIZE + "bits" );
		System.out.println("float/Float: " + Float.SIZE + "bits" );
		
		System.out.println("Valor Min double/Double: " + Double.MIN_VALUE);
		System.out.println("Valor Max float/Float: " + Float.MAX_VALUE);
	}

}
