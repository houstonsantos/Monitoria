package com.monitoria.atv_01_1p;

/**
 * 
 * @author José Cristiano
 * Crie tabuada de 1 a 10.
 */


public class Q06 {

	public static void main(String[] args) {
	
		for ( int i = 1; i <= 10; i++){    
			for ( int j = 1; j <= 10; j++) { 
				System.out.printf(i + "x" + j + "=%s\n\n", i * j);
			}
		}

	}

}

