package com.monitoria.atv_01_4p;

/**
 * 
 * @author Houston Santos
 * Escreva um código que iprima o desenho abaixo.
 * 01
 * 02 02
 * 03 03 03
 * 04 04 04 04
 * 05 05 05 05 05
 * 06 06 06 06 06 06
 * 07 07 07 07 07 07 07
 * 08 08 08 08 08 08 08 08
 * 09 09 09 09 09 09 09 09 09
 * 10 10 10 10 10 10 10 10 10 10
 * 11 11 11 11 11 11 11 11 11 11 11
 */

public class Q04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 11; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				if (i <= 9) {
					System.out.print(" 0" + i);
				}
					else {
						System.out.print(" " + i);
					}
			}
			System.out.println();
		}
	}
}