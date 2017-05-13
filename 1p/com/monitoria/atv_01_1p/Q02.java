package com.monitoria.atv_01_1p;
import java.util.Scanner;

/**
 * 
 * @author Houston Santos
 * Faça um programa que leia três números e mostre-os em ordem decrescente.
 */

public class Q02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		        
		System.out.println("Entre com primeiro número:");
		int num1 = scan.nextInt();
		        
		System.out.println("Entre com segundo número:");
		int num2 = scan.nextInt();
		        
		System.out.println("Entre com terceiro número:");
		int num3 = scan.nextInt();
		        
		if (num1 <= num2 && num1 <= num3 && num2 <= num3){
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
			System.out.println(num2 + " - " + num3 + " - " + num1);
		            
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
			System.out.println(num3 + " - " + num1 + " - " + num2);
		            
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
			System.out.println(num1 + " - " + num3 + " - " + num2);
		            
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
			System.out.println(num2 + " - " + num1 + " - " + num3);
		            
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
			System.out.println(num1 + " - " + num2 + " - " + num3);
        }
		
	}

}
