package com.monitoria.atv_01_1p;
import java.util.Scanner;

/**
 * 
 * @author Houston Santos
 * A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55. 
 * Faça um programa capaz de gerar a série até o n termo informado pelo usuário.
 */

public class Q04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		        
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println("Informe um número para a sequência de Fibonacci!");
		int fibonacci = scan.nextInt();
		        
		System.out.println(primeiro);
		System.out.println(segundo);
		        
		while (proximo <= fibonacci){
		       
			proximo = primeiro + segundo;
		    primeiro = segundo;
		    segundo = proximo;
		            
		    System.out.println(proximo);
		}
		
	}

}
