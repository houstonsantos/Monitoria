package com.monitoria.atv_01_1p;

/**
 * 
 * @author Houston Santos
 * Escreva um programa que imprime na sa�da os valores assumidos por x. Esta vari�vel x deve iniciar com algum valor escolhido por voc�. 
 * Se x for par, x deve receber o valor dele mesmo somado com 5. J� se x for �mpar, x deve receber o valor dele multiplicado por 2. 
 * O programa termina assim que x for maior que 1000. Por exemplo, para x = 10, a sa�da deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635, 1270. 
 * Crie este programa usando a estrutura de controle if-else.
 */

public class Q08{

	public static void main(String[] args) {
	
		int x = 10;

		while (x < 1000) {
			if (x % 2 == 0) {
				x = x + 5;

			} else {
				x = x * 2;
			}

			System.out.print(x + ", ");
		}

	}

}