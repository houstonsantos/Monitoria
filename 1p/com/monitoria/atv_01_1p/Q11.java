package com.monitoria.atv_01_1p;

/**
 * 
 * @author Houston Santos
 * Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
 */

public class Q11 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i += 2) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}	
		
	}

}
