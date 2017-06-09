package com.monitoria.atv_01_1p;

/**
 * 
 * @author Houston Santos
 * Começando em 0, imprima os números seguintes, enquanto a soma dos números já impressos for menor que 100.
 */

public class Q12 {

	public static void main(String[] args) {
			
		int r = 0;
		int i = 0;
				
		while (r + i < 100) {
			System.out.println(i);
			r += i;
			i++;
		}
	}
}
