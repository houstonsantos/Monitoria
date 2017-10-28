package com.monitoria.atv_01_1p;
import java.util.Scanner;

/**
 * 
 * @author Houston Santos
 * Ler 3 números reais do teclado e verificar se o primeiro é maior que a soma dos outros dois.
 */

public class Q14 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:  ");
		double numero1 = input.nextDouble();

		System.out.println("Digite o segundo numero:  ");
		double numero2 = input.nextDouble();

		System.out.println("Digite o terceiro numero:  ");
		double numero3 = input.nextDouble();

		double result = numero2 + numero3;
		
		System.out.println(result + " é o resultado da soma do numero " + numero2 + " e " + numero3);

		if(numero1 > result){
			System.out.println("o primeiro numero " + numero1 + " é maior que a soma");
			
		}else{
			System.out.println(numero1 + " é menor...");
			
		}

	}

}
