package com.monitoria.atv_01_4p;

/**
 * 
 * @author Houston Santos
 * Escreva um código onde faça comparação de string, int, boolean e char usando length, 
 * equals, equalsIgnoreCase, substring, indexOf e charAt.
 */

public class Q10 {
	
	public static void main(String[] args) {
		
	//Usando length, equals e equalsIgnoreCase
	String a = "Nutri House";
	String b = "nutri house";
	int comprimento = a.length();
	boolean resposta1 = a.equals(b);
	boolean resposta2 = a.equalsIgnoreCase(b);
	boolean resposta3 = b.equalsIgnoreCase(a);
	
	System.out.println(resposta1); 
	System.out.println(resposta2);
	System.out.println(resposta3);
	System.out.println(comprimento);
	
	//Usando substring, indexOf e charAt
	String x = "Pernambuco";
	String y = x.substring(0,5);
	String z = x.substring(6);
	int indice = x.indexOf("n");
	char letra = x.charAt(5);
	
	System.out.println(x); 
	System.out.println(y);
	System.out.println(z); 
	System.out.println(indice);
	System.out.println(letra);
	}
}

