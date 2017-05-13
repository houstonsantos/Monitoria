package com.monitoria.atv_01_4p;

/**
 * 
 * @author Houston A. Santos
 * Imprime os números impares e múltiplos de 3 e 5 entre 1 a 100 
 */

public class Q03 {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 == 0 && i % 5 == 0)
				System.out.println(i);
		}
	}
}
