package com.monitoria.atv_01_4p;
import javax.swing.JOptionPane;

/**
 * 
 * @author Houston Santos
 * Escreva um c�digo onde pe�a o sal�rio bruto o desconto e seja informado o valor do empr�stimo 
 * equivalente a 30% do sal�rio l�quido.
 */

public class Q07 {

	public static void main(String[] args) {
		
		String bruto;
		String desconto;
		
		bruto = JOptionPane.showInputDialog("Informe seu Salario Bruto");  
		desconto = JOptionPane.showInputDialog("Informe o Valor dos Descontos"); 
		
		float sBruto = Float.parseFloat(bruto);
		float Descontos = Float.parseFloat(desconto);
		
		float sLiquido = sBruto - Descontos;
		float emprestimo = sLiquido * 30 / 100;
		
		JOptionPane.showMessageDialog(null, emprestimo);
				
	}
}
