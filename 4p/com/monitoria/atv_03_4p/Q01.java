package com.monitoria.atv_03_4p;
import javax.swing.JOptionPane;

/**
 * 
 * @author Houston Santos
 *
 */

public class Q01 {
	
	public static void main(String[] args) {
		
		String[] user = new String[3];
		String[] idade = new String[3];
		int[] idades = new int[3];
						
		for (int i = 0; i <= 2; i++) {
			user[i] = JOptionPane.showInputDialog("Usuário " + (i + 1) + " Digite seu Nome!");
			idade[i] = JOptionPane.showInputDialog("Usuário " + (i + 1) + " Digite sua Idade!");
			
			for (int j = 0; j <= i; j++) {
				idades[j] = Integer.parseInt(idade[i]);
			}
		}	
	
		if (idades[0] > idades[1]) {	
			
			if (idades[1] > idades[2]) {
				JOptionPane.showMessageDialog(null, "Pessoal mais velha " + user[0] + "\n" + "Pessoa mais nova" + user[2]);
			}
		}
	}	
}
