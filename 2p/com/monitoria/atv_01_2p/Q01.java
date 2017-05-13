package com.monitoria.atv_01_2p;

/**
 * 
 * @author Houston Santos
 * Imprime os números pares de 1 a 150 de forma crescente.
 */

public class Q01 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 150; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}

