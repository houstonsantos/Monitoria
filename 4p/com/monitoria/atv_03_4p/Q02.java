package com.monitoria.atv_03_4p;
import javax.swing.JOptionPane;

/**
 * 
 * @author Houston Santos
 * Escreva um c�digo onde pe�a ao usu�rio para informar seu cargo, 
 * onde as op��es a serem apresentadas s�o (1 = Diretoria, 2 = Ger�ncia e 3 = Operacional), 
 * posteriormente pe�a o sal�rio bruto, depois o valor do desconto. 
 * E apresente o valor no qual ele tem direito a empr�stimo sendo (30% = Diretoria, 25% = Ger�ncia e 20% = Operacional) 
 * aplicado sobre o valor l�quido. Usar a classe JOptionPane.
 */

public class Q02 {

	/*public static float sL(float x, float y) {
		float sLiquido = x - y;
		return sLiquido;
	}*/
	
	public static void main(String[] args) {
		
		String infocargo;
		String bruto;
		String desconto;
		
		float sBruto; //= Float.parseFloat(bruto);
		float Descontos; //= Float.parseFloat(desconto);
		float emprestimo;
		//float sLiquido = sBruto - Descontos;
						
		infocargo = JOptionPane.showInputDialog("INFORME SEU CARGO!\n 1 - Diretoria\n 2 - Ger�ncia\n 3 - Operacional");
				
		switch (infocargo) {
		
			case "1":
				bruto = JOptionPane.showInputDialog("Informe seu Salario Bruto");  
				desconto = JOptionPane.showInputDialog("Informe o Valor dos Descontos");
				sBruto = Float.parseFloat(bruto);
				Descontos = Float.parseFloat(desconto);
				//emprestimo = sL(sBruto, Descontos) * 30 / 100;
				emprestimo = (sBruto - Descontos) * 30 / 100;
				JOptionPane.showMessageDialog(null, emprestimo);
				break;
				
			case "2":
				bruto = JOptionPane.showInputDialog("Informe seu Salario Bruto");  
				desconto = JOptionPane.showInputDialog("Informe o Valor dos Descontos");
				sBruto = Float.parseFloat(bruto);
				Descontos = Float.parseFloat(desconto);
				//emprestimo = sL(sBruto, Descontos) * 25 / 100;
				emprestimo = (sBruto - Descontos) * 25 / 100;
				JOptionPane.showMessageDialog(null, emprestimo);
				break;
				
			case "3":
				bruto = JOptionPane.showInputDialog("Informe seu Salario Bruto");  
				desconto = JOptionPane.showInputDialog("Informe o Valor dos Descontos");
				sBruto = Float.parseFloat(bruto);
				Descontos = Float.parseFloat(desconto);
				//emprestimo = sL(sBruto, Descontos) * 20 / 100;
				emprestimo = (sBruto - Descontos) * 20 / 100;
				JOptionPane.showMessageDialog(null, emprestimo);
				break;
		}
	}
}

