package com.monitoria.atv_01_1p;

/**
 * 
 * @author Houston Santos
 * Imprima a tabuada do 9 (até o décimo valor).
 */

public class Q13 {

	public static void main(String[] args) {
		
		int cont = 0;
			
		for(int i = 1; cont < 10; i++) {
					
			if(i % 9 == 0) {
				System.out.println(i);
				cont++;
			}
		}
	}
}