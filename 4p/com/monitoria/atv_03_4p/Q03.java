package com.monitoria.atv_03_4p;

/**
 * 
 * @author Houston Santos
 * Escreva um cógigo que imprima os númeroa primos de 1 a 150.
 */

public class Q03 { 
	
	public static void main(String[] args) {
		
		int contador;
		int numero = 0;
					
		for (int i = 1; i <= 150; i++) {
			contador = 0;
						
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					contador++;
					numero = j;
			}
			if (contador == 2) 
				System.out.println(numero);
		}
	}
}
