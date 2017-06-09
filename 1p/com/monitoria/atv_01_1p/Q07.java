package com.monitoria.atv_01_1p;

/**
 * 
 * @author Houston Santos
 * Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou inválida. 
 * Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês e outra para o ano. 
 * Considere que fevereiro pode ter somente 28 dias.
 */

public class Q07 {

	public static void main(String[] args) {
		
		int dia = 31;
		int mes = 5;
		int ano = 1982;

		if (ano < 1900 || ano > 2999 || mes < 1 || mes > 12) {
			System.out.println("Data inválida");

		} else if (dia <= 31 && mes <= 12) {
			
			if (dia > 28 && mes == 2 || dia == 31 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("Data inválida");
			} else {
				System.out.println("Data válida");
			}

		} else {
			System.out.println("Data inválida");
		}

	}

}



