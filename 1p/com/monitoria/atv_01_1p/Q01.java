package com.monitoria.atv_01_1p;
import java.util.Scanner;

/**
 * 
 * @author Houston Santos
 * Fa�a um programa que pe�a dois n�meros e imprima o maior deles.
 */

public class Q01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		   
		System.out.println("Entre com o primeiro n�mero");
		int num1 = scan.nextInt();
		        
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		        
		if (num1 > num2){
			System.out.println("O num1 � maior: " + num1);
		} else {
			System.out.println("O num2 � maior: " + num2);
		}
		
	}

}
