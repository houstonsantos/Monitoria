package com.monitoria.atv_01_4p;
import javax.swing.JOptionPane;

/**
 * 
 * @author Houston Santos
 * Informe sua idade para identificar se o voto � obrigat�rio, n�o � obrigat�rio ou facultativo.
 */

public class Q05 {

	public static void main(String[] args) {
		
		String vIdade;
		vIdade = JOptionPane.showInputDialog("Informe sua Idade!");
		int idade = Integer.parseInt(vIdade);
		
		if (idade == 16 || idade == 17 || idade >= 70) {
			JOptionPane.showMessageDialog(null, "Seu voto � facultativo!");
		}
			else if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Voc� � menor de idade, seu voto n�o e permitido!");
			}
				else {	
					JOptionPane.showMessageDialog(null, "Seu voto � obrigatorio!");
				}
	}
}
