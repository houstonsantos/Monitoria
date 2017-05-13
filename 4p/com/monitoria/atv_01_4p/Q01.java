package com.monitoria.atv_01_4p;

/**
 * 
 * @author Houston Santos
 * Imprime os números impares de 1 a 50 de forma decrescente.
 */

public class Q01 {
	
	public static void main(String[] args) {
		
		for (int i = 50; i >= 1; i--) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
}
